package com.MessageSource2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class Employee  {
	
	@Value("300000")
	double salary;
	
	@Autowired
	private Person person;
	
	public Employee() {
		System.out.println(person);
		System.out.println("employee created");
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", person=" + person.name +" age="+person.roll+ "]";
	}

	
	
}
