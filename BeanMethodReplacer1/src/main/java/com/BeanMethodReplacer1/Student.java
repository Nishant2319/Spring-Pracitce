package com.BeanMethodReplacer1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student{
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
	
	public String getName(int a) {
		return "value of a="+a;
	}

	
	public String getName(int a,int b) {
		return "value of a="+a+" ,b="+b;
	}
	public void setName(String name) {
		System.out.println("set name");
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
}
