package test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.AnnotationComponentBean3.Employee;
import com.AnnotationComponentBean3.Person;

@Configuration
@ComponentScan("test1")
public class MyConfiguration {

	@Bean
	
	public Employee createBean1(@Qualifier("person") Person p) { // autowire the above bean
		System.out.println(p.hashCode());
		return new Employee(p.getName(), p.getAge(), 50000);
	}
}
