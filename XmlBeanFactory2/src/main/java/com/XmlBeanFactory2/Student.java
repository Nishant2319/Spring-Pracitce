package com.XmlBeanFactory2;

public class Student {
	int roll;
	String name;
	
	Boy b;
	
	
	
	public Boy getB() {
		return b;
	}
	public void setB(Boy b) {
		this.b = b;
	}
	public Student(int roll, String name) {
		super();
		System.out.println("in student constructor");
		this.roll = roll;
		this.name = name;
	}
	
	
}
