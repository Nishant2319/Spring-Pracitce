package com.MessageSource1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;

public class Person {
	
	String name;
	int age;
	
	@Autowired
	MessageSource msgs;
	
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
		return msgs.getMessage("person.msg",new Object[] {name,age},"khali h",null);
	}
	
	
	
}
