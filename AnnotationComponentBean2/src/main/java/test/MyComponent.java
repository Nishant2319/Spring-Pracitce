package test;
import com.AnnotationComponentBean2.*;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.AnnotationComponentBean2.Person;

@Component
public class MyComponent {
	
		@Bean
//		@Scope("prototype")
		@Qualifier("person")
		public Person createBean() {
			return new Person("Nishant",20);
		}
		
		@Bean
		public Employee createBean1(@Qualifier("createBean") Person p) { //autowire the above bean
			System.out.println(p.hashCode());
			return new Employee(p.getName(),p.getAge(),50000);
		}
}
