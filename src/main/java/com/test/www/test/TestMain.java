package com.test.www.test;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mysql.jdbc.Buffer;
/**
 * 测试用
 * @author dabin
 * 2015年11月7日
 */
public class TestMain {
    
    private static String string;
    public static void main(String[] args) {
    	String s = " ";
    	char charAt = s.charAt(0);
    	
    	
    	URL url =null;
    	try {
			 url = new URL("http://www.baidu.com");
			 
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	try {
			URLConnection openConnection = url.openConnection();
			
		     HttpURLConnection httpURLConnection =  (HttpURLConnection) openConnection;
	         httpURLConnection.setDoOutput(true);
	        //httpURLConnection.setRequestMethod("GET");
	       // httpURLConnection.setRequestProperty("Accept-Charset", "utf-8");
	       // httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			
			
			
			OutputStream outputStream = openConnection.getOutputStream();
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
			outputStreamWriter.flush();
			InputStream inputStream = openConnection.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			System.out.println(bufferedReader);
			
			String readLine = bufferedReader.readLine();
			System.out.println(readLine);
			
			String line;
			StringBuffer stringBuffer = new StringBuffer();
			while((line = bufferedReader.readLine()) != null){
				System.out.println(line);
				stringBuffer.append(line);
	        }
			System.out.println(stringBuffer.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
        //ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
    //    URL resource = contextClassLoader.getResource("/");
//        String file = resource.getFile();
//        System.out.println(file);
//        URL resource = Class.class.getClass().getResource("/");
//        String file = resource.getFile();
//        System.out.println(file);
//        testString("aaaa");
        
/*
 * type:mobile
info:13316029907
*/
        
   /*     StringBuffer buffer = new StringBuffer();
//        buffer.append("type=").append("huitongkuaidi").append("&");
//        buffer.append("postid=").append("350456106284");
        buffer.append("type=").append("mobile").append("&");
        buffer.append("info=").append("13316029907");
        
       // https://www.baidu.com/s?wd=464的
        StringBuffer resultBuffer = new StringBuffer();
        String tempLine = null;
        try {
            //URL toUrl = new URL("http://www.kuaidi100.com/query");
        //    URL toUrl = new URL("http://shouquan.sibu.cn/checkAuth.php");
            URL toUrl = new URL("https://www.baidu.com/s");
            URLConnection openConnection = toUrl.openConnection();
            HttpURLConnection httpURLConnection =  (HttpURLConnection) openConnection;
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Accept-Charset", "utf-8");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Length", String.valueOf(buffer.length()));
            OutputStream outputStream = httpURLConnection.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
          //  outputStreamWriter.write("wd=464的");
            outputStreamWriter.flush();
            
           if(httpURLConnection.getResponseCode()>=300){
                throw new Exception("HTTP Request is not success, Response code is " + httpURLConnection.getResponseCode());
           }
           
           InputStream inputStream = httpURLConnection.getInputStream();
           InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
           BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
           
           while((tempLine = bufferedReader.readLine()) != null){
                resultBuffer.append(tempLine);
           }
           System.out.println(resultBuffer.toString());
           System.out.println(new String("\u975e\u6cd5\u8bf7\u6c42"));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        */
//        System.out.println(0x01);
//        
//        
//         // 按指定模式在字符串查找
//          //String line = "This order was placed for QT3000! OK?";
//        //  String pattern = "(.*)(\\d+)(.*)";
//          String line = "bbcdfsdbadfsafafab";
//          String pattern = "(.*)(a+)";
//
//          // 创建 Pattern 对象
//          Pattern r = Pattern.compile(pattern);
//
//          // 现在创建 matcher 对象
//          Matcher m = r.matcher(line);
//          System.out.println(m.groupCount());
//          if (m.find( )) {
//             for (int i = 0; i < m.groupCount(); i++) {
//                 System.out.println("Found value : "+i+":" + m.group(i) );
//            }
//          } else {
//             System.out.println("NO MATCH");
//          }
       
    }
    
    public static String  convert(String utfString){  
        StringBuilder sb = new StringBuilder();  
        int i = -1;  
        int pos = 0;  
          
        while((i=utfString.indexOf("\\u", pos)) != -1){  
            sb.append(utfString.substring(pos, i));  
            if(i+5 < utfString.length()){  
                pos = i+6;  
                
                char a =(char)Integer.parseInt(utfString.substring(i+2, i+6), 16);
                
                
                sb.append(a);  
            }  
        }  
          
        return sb.toString();  
    }  
    
    public static  void testString(CharSequence charSequence){
        System.out.println("测试CharSequence");
    }
}