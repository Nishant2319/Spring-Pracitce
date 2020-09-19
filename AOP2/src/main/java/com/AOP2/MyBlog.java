package com.AOP2;

import org.springframework.stereotype.Component;

@Component("blog")
public class MyBlog {
	
	public void showBlog() {
		System.out.println("blog1 is showing");
	}
	
	public void showBlog(int a) {
		System.out.println("blog2 is showing");
	}
}
