package com.XmlBeanContextAware1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Student implements ApplicationContextAware{
	int roll;
	String name;
	
	
	private ApplicationContext context;

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
	
	public Boy getBoy() {
		return (Boy) context.getBean("Bo");
	}
	
	@Required
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context=applicationContext;
		
	}
	
	
	
}
