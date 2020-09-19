package com.XmlBeanAutowire1;

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

		System.out.println(s1);
		
		Boy b1=s1.getBoy1();
		
		System.out.println(b1.age);
		
		

	}
}
