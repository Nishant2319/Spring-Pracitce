package com.XmlBean1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");

		Student s = (Student)con.getBean("stu");

		System.out.println(s.name);
		System.out.println(s.roll);
		

	}
}
