package com.test.www.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 测试数据库是否连通
 * 
 * @author pxw
 * 
 */
@Controller
public class TestConnectionController {

	public TestConnectionController(){
		System.out.println("TestConnectionController启动");
	}
	
	@Autowired
	private TestClient testClient;
	
	/**
	 * 测试web否成功
	 * 
	 * @return
	 */
	@RequestMapping(value = "/test/read")
	public @ResponseBody
	Object testWeb(String test){
		Map<String, Integer> data = new HashMap<String, Integer>();
		System.out.println("进入testWeb");
		
		System.out.println("调用testClient.printMe()");
		testClient.printMe();
		System.out.println("参数是"+test);
		System.out.println("调用testClient.printMe()结束");
		
		data.put("code", 0);
		return data;
	}
	
	/**
	 * 测试其他否成功
	 * 
	 * @return
	 */
	@RequestMapping(value = "/test/other")
	public @ResponseBody Object testWebother(){
		Map<String,String > data = new HashMap<String, String>();
		
		TestInstrumentedHashSet<String> set = new TestInstrumentedHashSet<String>();
		set.addAll(Arrays.asList("1","2","3"));
		System.out.println("总数等于："+set.getAddCount());
		
		
		data.put("msg", "成功");
		return data;
	}
	

 
}
