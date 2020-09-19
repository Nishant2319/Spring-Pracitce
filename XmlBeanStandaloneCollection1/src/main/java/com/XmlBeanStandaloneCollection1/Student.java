package com.XmlBeanStandaloneCollection1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;


//if we use constructor then it will check the name and inject with constructor instead of setter
public class Student  {
	int roll;
	String name;
	
//	@Autowired
//	@Qualifier("sub")
	
	//or
	
	
	@Value("#{sub}")                //in the value parameter we can use SpEL also 
	private List<String> sub;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public List<String> getSub() {
		return sub;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + " ,Subject="+sub+"]";
	}
	

	
	
}
