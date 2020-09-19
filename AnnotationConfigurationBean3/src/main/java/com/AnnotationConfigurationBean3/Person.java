package com.AnnotationConfigurationBean3;




public class Person {
	
	
	String name;
	
	
	int age;
	
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
	
	
	public Person() {
		System.out.println("person created");
	}
	
	
	
}
