package com.BeanLifeCycleInterface1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Teacher implements InitializingBean,DisposableBean {
	String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		System.out.println("set suject");
		this.subject = subject;
	}
	
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy teacher");
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init teacher");
	}

	@Override
	public String toString() {
		return "Teacher [subject=" + subject + "]";
	}
	
	
	
}
