package com.XmlBeanInheritence1;

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
        
        Employee em=con.getBean("employee",Employee.class);
        
        System.out.println(em);
    }
}
