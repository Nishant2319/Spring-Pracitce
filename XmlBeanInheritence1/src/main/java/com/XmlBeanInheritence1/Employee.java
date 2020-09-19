package com.XmlBeanInheritence1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Employee {
	double salary;
	String name;
	int age;
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
		
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + ", age=" + age + "]";
	}

	
	
}
