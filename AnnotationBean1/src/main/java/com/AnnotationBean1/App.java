package com.AnnotationBean1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
        
        Student s1=con.getBean("student",Student.class);
        Student s2=con.getBean("student",Student.class);
        
        System.out.println(s1);
        
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        
        
    }
}
