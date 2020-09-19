package com.MessageSource2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
       
       Person p=con.getBean("person",Person.class);
       System.out.println(p);
       
       Employee e=con.getBean("employee",Employee.class);
       System.out.println(e);
       
    }
}
