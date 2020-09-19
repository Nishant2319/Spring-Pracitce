package com.XmlBeanAutowire2;

import org.springframework.beans.factory.annotation.Autowired;


//if we use constructor then it will check the name and inject with constructor instead of setter
public class Student  {
	int roll;
	String name;
	
	
	private Boy boy;

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

	public Student(Boy b) {
		System.out.println("in Student Boy parameterized constructor");
		this.boy=b;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + " ,age="+boy.age+"]";
	}
	

	
	
}
