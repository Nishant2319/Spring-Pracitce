package com.BeanMethodReplacer1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 AbstractApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
         
         Student s=(Student)con.getBean("stu");
         System.out.println(s);
         System.out.println(s.getName());
         System.out.println(s.getName(14));
         System.out.println(s.getName(14,68));
    }
}
