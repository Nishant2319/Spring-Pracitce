package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ManyContextTest1Application {

	public static void main(String[] args) {
		ApplicationContext con1=SpringApplication.run(ManyContextTest1Application.class, args);
		
//		ApplicationContext con2=new ClassPathXmlApplicationContext("spring.xml");
		
		ApplicationContext con5=new ClassPathXmlApplicationContext(new String[] {"spring2.xml","spring.xml"});
//		
		ApplicationContext con3=new AnnotationConfigApplicationContext(MyComponent1.class);
//		
		ApplicationContext con4=new AnnotationConfigApplicationContext(MyConfiguration1.class);
		
		
		
		Person p1=con5.getBean("person",Person.class);
		System.out.println("p1="+p1);
		
		Person p2=con1.getBean("person",Person.class);
		System.out.println("p2="+p2);
		
//		Person p3=con3.getBean("person",Person.class);
//		System.out.println("p3="+p3);
		
		Person p4=con4.getBean("person",Person.class);
		System.out.println("p4="+p4);
		
//		Person p5=con2.getBean("person",Person.class);
//		System.out.println("p5="+p5);
	}

}
