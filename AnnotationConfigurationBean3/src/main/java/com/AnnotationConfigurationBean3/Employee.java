package com.AnnotationConfigurationBean3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;


public class Employee  {
	
	double salary;
	
	

	
	
	public Employee() {
		System.out.println("employee created");
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
		
	

	
	
}
