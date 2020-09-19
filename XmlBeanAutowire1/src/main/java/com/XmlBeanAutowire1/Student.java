package com.XmlBeanAutowire1;

import org.springframework.beans.factory.annotation.Autowired;

public class Student  {
	int roll;
	String name;
	
	//byName the name will check in setter method name i.e Boy2  = boy2
	private Boy boy1;

	public Boy getBoy1() {
		return boy1;
	}

	public void setBoy2(Boy boy1) {
		this.boy1 = boy1;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public Student(int roll, String name) {
		super();
		System.out.println("in student constructor");
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	

	
	
}
