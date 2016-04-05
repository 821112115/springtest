package com.test.www;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 测试提交 再次测工
 * @author dabin
 * 2016年4月5日
 */
public class a {

	/**
	 * asdf 没
	 */
	public static void main(String[] args) {
		System.out.println("Holle world");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		//获取当前月第一天：
        Calendar c = Calendar.getInstance();    
        c.add(Calendar.MONTH, 0);
        c.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天 
        String first = format.format(c.getTime());
        System.out.println("===============first:"+first);
        
        //获取当前月最后一天
        Calendar ca = Calendar.getInstance();    
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));  
        String last = format.format(ca.getTime());
        System.out.println("===============last:"+last);
		
    	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(formatter.format(new Date()).substring(0,7));
		
		/*try {
			FileOutputStream outputStream = new FileOutputStream("a.txt");
		
			System.out.println();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
	}
	
	
}
