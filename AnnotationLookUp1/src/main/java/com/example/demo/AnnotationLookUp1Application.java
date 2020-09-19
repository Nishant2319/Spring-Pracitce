package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class AnnotationLookUp1Application {

	public static void main(String[] args) {
		ApplicationContext con=SpringApplication.run(AnnotationLookUp1Application.class, args);
		
		Student s1 = (Student)con.getBean("stu");

		System.out.println(s1.roll);
		
		Student s2=(Student)con.getBean("stu");
		System.out.println(s2==s1);
		
		Boy b1=(Boy)con.getBean("boy");
		
		
		Boy b2=(Boy)con.getBean("boy");
		
		System.out.println(b1==b2);
		
		
		System.out.println(s1.getBoy().hashCode());
		System.out.println(s1.getBoy().hashCode());
		System.out.println(s1.getBoy().hashCode());
		
		System.out.println(s1);
	}

}
