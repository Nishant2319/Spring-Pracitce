package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component
public class MyComponent {
	@Bean
	public Person person() {
		return new Person("jhattu",25);
	}
}
