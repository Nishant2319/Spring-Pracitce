package com.BeanLifeCycleXml1;

public class Student {
	int roll;
	String name;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		System.out.println("set roll no.");
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("set name");
		this.name = name;
	}
	
	public void init() {
		System.out.println("in init");
	}
	
	public void destroy() {
		System.out.println("in destroy");
	}
	
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
}
