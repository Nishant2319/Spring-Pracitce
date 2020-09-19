package com.XmlBeanFactory1;

public class Boy {
	int age;

	public Boy(int age) {
		super();
		
		System.out.println("in boy constructor");
		
		this.age = age;
	}
	
	public static Boy boyFactory() {
		return new Boy(17);
	}
	
}
