package com.BeanMethodLookUp1;

abstract public class Student  {
	int roll;
	String name;
	
//	public abstract Boy look();
	
	//or we can use this
	public Boy look() {
		return new Boy();
	}

	public Student(int roll, String name) {
		super();
		System.out.println("in student constructor");
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	

	
	
}
