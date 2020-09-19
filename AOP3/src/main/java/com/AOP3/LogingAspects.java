package com.AOP3;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LogingAspects {
	
	@Before("loginPointCut()")
	public void login() {
		System.out.println("you have logged in ");
	}
	
	@Pointcut("execution(public void showBlog())")
	public void loginPointCut() {
	}
}
