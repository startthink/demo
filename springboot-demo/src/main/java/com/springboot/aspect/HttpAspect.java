package com.springboot.aspect;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 *@ClassName: HttpAspect
 *@Description: TODO()
 *@author admin
 *@date 2017年4月17日 下午12:02:09
 */
@Aspect
@Component
public class HttpAspect {
	private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);
	//方式一：在方法前拦截单个方法
	@Before("execution(public * com.springboot.controller.HelloController.girlList(..))")
	public void logBefore(){
		logger.info("ccccccccccccccccccc");
	}
	
	@After("execution(public * com.springboot.controller.HelloController.girlList(..))")
	public void logAfter(){
		logger.info("ddddddddddddddddddd");
	}
	
	
	
	
	//方式二：
	@Pointcut("execution(public * com.springboot.controller.HelloController.girlList(..))")
	public void log(){
	}
	@Before("log()")//执行方法前
	public void doBefore(JoinPoint joinPoint){
		ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		//url
		logger.info("url={}", request.getRequestURL());
		//method
		logger.info("method={}", request.getMethod());
		//ip
		logger.info("ip={}", request.getRemoteAddr());
		//类方法
		logger.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
		//参数
		logger.info("args={}", joinPoint.getArgs());
	}
	@After("log()")//执行方法后
	public void doAfter(){
		logger.info("gggggggggggg");
	}
	@AfterReturning(returning = "object", pointcut = "log()")//获得执行方法后返回的内容
	public void doAfterReturning(Object object){
		logger.info("response={}", object.toString());
	}
	
	
}
