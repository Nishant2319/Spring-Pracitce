package com.XmlBeanAutowire2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");

		Student s1 = (Student)con.getBean("stu");
		
		Boy b1=(Boy)con.getBean("boy");
		System.out.println(b1.age);
		
		System.out.println(s1);
		
		

	}
}
