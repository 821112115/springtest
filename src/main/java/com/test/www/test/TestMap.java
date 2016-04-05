package com.test.www.test;

import java.util.HashMap;
import java.util.Map;

public class TestMap {


	public static void main(String[] args) {
		
		Map<Integer,String> map= new HashMap<Integer,String>();
		method(map);
	}
	
	

	public static void method(Map<Integer,String>map){
		System.out.println(map.put(8,"wangacai"));
		System.out.println(map.put(8,"xiaoqiang"));
	}	
}