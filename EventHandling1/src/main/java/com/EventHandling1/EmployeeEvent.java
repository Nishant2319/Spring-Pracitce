package com.EventHandling1;

import org.springframework.context.ApplicationEvent;

public class EmployeeEvent extends ApplicationEvent{
	Employee emp;
	public EmployeeEvent(Object source) {
		super(source);
		emp=(Employee)source;
	}

	@Override
	public String toString() {
		return "EmployeeEvent: employee "+emp.name+" is fetching his details";
	}
		
	
}
