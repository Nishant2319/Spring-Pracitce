package com.AnnotationComponentBean2;
import test.*;
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
//        ApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext con=new AnnotationConfigApplicationContext(MyComponent.class);
        
//        MyComponent m=con.getBean("myComponent",MyComponent.class);
//        System.out.println("myComponent="+m.hashCode());
        
        
//        Person p1=con.getBean("createBean",Person.class);
//        System.out.println(p1.hashCode());
//        
//        Person p3=con.getBean("createBean",Person.class);
//        System.out.println(p3.hashCode());
//
//        
//        
//        Person p2=con.getBean("createBean",Person.class);
//        System.out.println(p2.hashCode());
//        
//        
//        
//        Employee e1=con.getBean(Employee.class);
//        System.out.println(e1);
    }
}
