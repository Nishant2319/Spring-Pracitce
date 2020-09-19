package com.AnnotationComponentBean1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
	
		@Bean 
		public Person createBean() {
			return new Person("Nishant",20);
		}
}
