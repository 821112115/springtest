package com.test.www.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


/**
 * 拦截器(显示请求URL)
 * (wurunbin)
 */
public class LoginFilter extends HandlerInterceptorAdapter{


   public LoginFilter() {
		super();
		System.out.println("拦截器初始化完成");
	}

   
   
    @Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {
    	System.out.println("本次访问的URL:"+request.getRequestURI());
		return super.preHandle(request, response, handler);
	}


   	
	   
}