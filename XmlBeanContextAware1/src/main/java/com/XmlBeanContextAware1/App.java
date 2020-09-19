package com.XmlBeanContextAware1;

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

		System.out.println(s1.name);
		System.out.println(s1.roll);
		
		Student s2=(Student)con.getBean("stu");
		System.out.println(s2==s1);
		
		Boy b1=(Boy)con.getBean("Bo");
		
		
		Boy b2=(Boy)con.getBean("Bo");
		
		System.out.println(b1==b2);
		
		
		System.out.println(s1.getBoy().hashCode());
		System.out.println(s1.getBoy().hashCode());
		System.out.println(s1.getBoy().hashCode());
		
		

	}
}
