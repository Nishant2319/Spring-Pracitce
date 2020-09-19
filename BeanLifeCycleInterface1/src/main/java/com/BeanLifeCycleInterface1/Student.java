package com.BeanLifeCycleInterface1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean {
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
	
	
	
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init student");
		
	}
	public void destroy() {
		System.out.println("destroy Student");
	}
	
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
}
