package com.AnnotationConfigurationBean2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
@ComponentScan("test1")
public class MyConfiguration {

	@Bean
//	@DependsOn(value = "createBean1")
	public Person createBean() {
		return new Person();
	}

	@Bean
	public Employee createBean1(@Qualifier("createBean") Person p) { // autowire the above bean

		return new Employee();
	}

}
