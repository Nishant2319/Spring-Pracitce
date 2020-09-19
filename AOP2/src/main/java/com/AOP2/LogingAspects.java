package com.AOP2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LogingAspects {
	
	@Before("execution(public void showBlog())")
	public void login() {
		System.out.println("you have logged in ");
	}
}
