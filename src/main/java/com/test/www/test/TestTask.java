package com.test.www.test;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * 测试定时器
 * @author dabin
 * 2015年5月23日
 */
@Service
public class TestTask {

	
	
	public TestTask() {
		super();
		System.out.println("启动TestTask");
	}

	@Scheduled(cron = "0 11 15 * * *")
	public void task1(){
		for (int i=0;i<10;i++){
			System.out.println("定时任务测试打印"+i);
		}
	}
	
	
}
