package com.MessageSource1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
        
    {	
    	ApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("main started");
        
        System.out.println(((ResourceBundleMessageSource)con.getBean("messageSource")).toString());
        System.out.println(con.getMessage("end", null,"the end",null));
        
        
        Person p=con.getBean("person",Person.class);
        
        System.out.println(p);
        
    }
}
