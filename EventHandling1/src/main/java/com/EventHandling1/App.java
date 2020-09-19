package com.EventHandling1;

import org.springframework.context.ApplicationContext;
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
        Employee e=con.getBean("employee",Employee.class);
        System.out.println(e);
        
//        Person p1=con.getBean("person",Person.class);
//        System.out.println(p1.hashCode());
//        
//        Person p2=con.getBean("person",Person.class);
//        System.out.println(p2.hashCode());
        
    }
}
