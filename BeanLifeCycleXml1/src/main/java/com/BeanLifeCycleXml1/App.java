package com.BeanLifeCycleXml1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
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
        ConfigurableApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
        
        
        //or we can use
//        AbstractApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
        
        Student s=(Student)con.getBean("stu");
        System.out.println(s);
        
        con.close();
    }
}
