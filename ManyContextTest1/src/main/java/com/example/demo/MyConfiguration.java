package com.example.demo;

import java.beans.BeanProperty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import({MyConfiguration1.class,MyComponent1.class})
public class MyConfiguration {
//	@Bean
//	public Person person() {
//		return new Person("rohit",8);
//	}
}
