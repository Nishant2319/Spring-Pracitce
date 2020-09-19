package com.EventHandling1;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener {//implements ApplicationListener{
	
	
	//by condition will call only EmployeeEvent  event
	@EventListener(condition = "#root.args[0].getClass().getSimpleName().equals('EmployeeEvent')")
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println(event);
	}
	
}
