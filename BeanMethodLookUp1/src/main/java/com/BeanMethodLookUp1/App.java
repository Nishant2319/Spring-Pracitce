package com.BeanMethodLookUp1;

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
		
		Boy b1=s1.look();
		Boy b2=s1.look();
		Boy b3=s1.look();
		
		System.out.println(b1.hashCode()+", age="+b1.age);
		System.out.println(b2.hashCode()+", age="+b1.age);
		System.out.println(b3.hashCode()+", age="+b1.age);
		
		

	}
}
