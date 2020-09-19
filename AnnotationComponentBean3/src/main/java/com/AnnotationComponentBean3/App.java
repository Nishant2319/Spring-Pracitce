package com.AnnotationComponentBean3;
import test.*;
import test1.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext con=new AnnotationConfigApplicationContext(MyComponent.class);
        
        MyComponent m=con.getBean("myComponent",MyComponent.class);
        System.out.println(m.hashCode());
        
        
        Person p1=con.getBean("createBean",Person.class);
        System.out.println(p1.hashCode());

        
        
        Person p2=con.getBean("createBean1",Person.class);
        System.out.println(p2.hashCode());
        
        
        
        Employee e1=con.getBean(Employee.class);
        System.out.println(e1);
    }
}
