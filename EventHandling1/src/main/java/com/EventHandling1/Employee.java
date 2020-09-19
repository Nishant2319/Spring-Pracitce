package com.EventHandling1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class Employee extends Person { //implements ApplicationEventPublisherAware{
	
	@Value("#{780000}")
	double salary;
	public boolean check;
	
	//@Autowired
	ApplicationEventPublisher applist;
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
		
	
	
	@Override
	public String toString() {
		EmployeeEvent ee=new EmployeeEvent(this);
		applist.publishEvent(ee);
		return "Employee [salary=" + salary + ", name=" + name + ", age=" + age + "]"+hashCode();
	}

//	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
//		// TODO Auto-generated method stub
//		this.applist=applicationEventPublisher;
//	}
	
	
	
	
	
}
