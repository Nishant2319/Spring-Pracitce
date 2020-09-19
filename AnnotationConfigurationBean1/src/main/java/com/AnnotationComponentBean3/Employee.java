package com.AnnotationComponentBean3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;


public class Employee extends Person {
	
	double salary;
	
	

	public Employee(String name, int age,double s) {
		super(name, age);
		System.out.println("employee created");
		salary=s;
		// TODO Auto-generated constructor stub
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
		
	
	
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + ", age=" + age + "]"+hashCode();
	}

	
	
	
	
	
}
