package com.XmlBeanAutowire2;


public class Boy {
	int age;
	
	
	public Boy() {
		
	}
	public Boy(int age) {
		super();
		
		System.out.println("in boy constructor");
		
		this.age = age;
	}
	
}
