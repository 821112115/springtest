package com.test.www.test;


import org.aspectj.weaver.ast.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * 测试类
 * @author dabin
 * 2015年11月6日
 */
public class main {
	
	static Logger logger = LoggerFactory
			.getLogger(main.class);
	
	   public static void main(String[] args) {
			String s ="1";
			String s1 ="我";
			String s2 =" ";
			String s3 ="a";
			String s4 ="A";
			String s5 ="&";
			String s6="或&锂&使&用者 载工工'<>fa\"";
			System.out.println("程序开始执行");
			int i=1;
			try {
				test(i);
			} catch (Exception e) {
				logger.error("111", e);
			}
			
			
			System.out.println("程序继续执行");
			
			
			System.out.println(s.length());
			System.out.println(s1.length());
			System.out.println(s2.length());
			System.out.println(s3.length());
			System.out.println(s4.length());
			System.out.println(s5.length());
			
			System.out.println(s6.replaceAll("&", "&amp"));
			System.out.println(s6);
			
			
			
		}
	   public static void test(int i){
			if (i==1){
				throw new IllegalArgumentException("抛异常");
			}
	   }
}
