package test1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.AnnotationComponentBean3.Person;

@Component
public class MyComponent1 {
	@Bean
	@Scope("prototype")
	public Person createBean() {
		return new Person("Nishant",20);
	}
	
}
