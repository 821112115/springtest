package com.test.www.test;

import java.util.ArrayList;
import java.util.List;



public class TestInterface{
 
		public static void main(String[] args) {
			List<String> strings= new ArrayList<String>();
			unsafeAdd(strings,new Integer(42));
			String s = strings.get(0);
			System.out.println(s);
		}	
		@SuppressWarnings("unchecked")
		private static void unsafeAdd(List list,Object o){
			list.add(o);
		}
}
