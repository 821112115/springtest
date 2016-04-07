package com.test.www.spring.transaction;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试SPRING 事务接口类
 * @author dabin
 * 2016年4月5日
 */
@Controller
public class TransactionController {

	
	public @ResponseBody Object transaction(){
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("msg","成功执行transaction");
		data.put("code",100);
		return data;
	}
	
}
