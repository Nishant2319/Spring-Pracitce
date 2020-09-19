package test1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.AnnotationComponentBean3.Person;

@Configuration
public class MyConfiguration1 {
	@Bean("person")
//	@Scope("prototype")
	public Person createBean() {
		return new Person("Nishant",20);
	}
	
}
