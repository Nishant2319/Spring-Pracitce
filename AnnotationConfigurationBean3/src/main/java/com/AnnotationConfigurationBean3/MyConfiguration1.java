package com.AnnotationConfigurationBean3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class MyConfiguration1 {
	@Bean
//	@DependsOn(value = "createBean1")
	public Person createBean() {
		return new Person();
	}
}
