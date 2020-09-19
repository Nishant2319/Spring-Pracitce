package com.BeanLifeCycleConstructor1;

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
         
         
         Teacher t=(Teacher)con.getBean("tec");
         System.out.println(t);
         con.close();
    }
}
