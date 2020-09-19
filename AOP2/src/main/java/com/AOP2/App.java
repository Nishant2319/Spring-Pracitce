package com.AOP2;

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
        
        MyBlog b=con.getBean("blog",MyBlog.class);
        
        Test t=con.getBean("test",Test.class);
        
        b.showBlog();
        b.showBlog(3);
        
        t.showBlog();
    }
}
