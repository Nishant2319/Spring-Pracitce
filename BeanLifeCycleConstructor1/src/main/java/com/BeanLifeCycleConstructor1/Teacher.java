package com.BeanLifeCycleConstructor1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Teacher{
	String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		System.out.println("set suject");
		this.subject = subject;
	}
	
	@PreDestroy
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy teacher");
		
	}
	
	@PostConstruct
	public void inti() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init teacher");
	}

	@Override
	public String toString() {
		return "Teacher [subject=" + subject + "]";
	}
	
	
	
}
