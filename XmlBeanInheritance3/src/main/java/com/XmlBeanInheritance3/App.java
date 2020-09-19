package com.XmlBeanInheritance3;

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
        
        Rectangle r=con.getBean("rectangle",Rectangle.class);
        
        Triangle t=con.getBean("triangle",Triangle.class);
        
        
        System.out.println(r);
        System.out.println(t);
    }
}
