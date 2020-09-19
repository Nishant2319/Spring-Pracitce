package com.AOP1;

public class LogingAspects {
	
	public void login() {
		System.out.println("you have logged in ");
	}
	
	public void login(String b) {
		System.out.println("you have logged in with name+"+b);
	}
	
}
