package com.AOP4;

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
        
        
        Person p=con.getBean("person",Person.class);
        p.setName("rohit");
        p.setAge(34);
//        System.out.println(p);
        p.setPara("rohit", 34);
    }
}
