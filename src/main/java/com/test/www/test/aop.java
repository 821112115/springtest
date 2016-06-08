package com.test.www.test;



import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class aop {

    
	

	public aop() {
		super();
		System.out.println("AOP类初始化");
	}
	@Pointcut("execution(public * com.test.www.test.TestConnectionController.testWeb(..))")
    public void recordLog(){System.out.println("进入切面");}

    @Before("recordLog()")
    public void before() {
        this.printLog("已经记录下操作日志@Before 方法执行前");
    }
    //环绕方法
    @Around("recordLog()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        this.printLog("已经记录下操作日志@Around 方法执行前");
        //获取接口传入的参数
        Object[]  args = pjp.getArgs();
        for (Object object : args) {
        	System.out.println(object.toString());
		}
        
     
        this.printLog("已经记录下操作日志@Around 方法执行后");
        //执行目标方法
        return pjp.proceed();
    }

    @After("recordLog()")
    public void after() {
        this.printLog("已经记录下操作日志@After 方法执行后");
    }

    private void printLog(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
    	
    	ApplicationContext appCtx = new ClassPathXmlApplicationContext("/spring/dispatcher-servlet.xml");
    	//ApplicationContext appCtx = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
    	TestConnectionController bean = (TestConnectionController)appCtx.getBean("testConnectionController");
    	bean.testWeb("A");

	}
 }
