package com.AnnotationBean1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component						//by default bean name is same as class started with small letter 
public class Student {
	
	@Value("Nishant")
	String name;
	
	@Value("#{1}")                   		//value works with only string ,but we can use SpEL to solve our datatype problem
	int roll;
	
	public Student() {
		System.out.println("in default constructor");
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}
	
	
	
}
