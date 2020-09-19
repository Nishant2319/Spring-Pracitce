package com.AOP4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PersonAspect {
	
//	@Before("args(String)")
//	void setAspect(){
//		System.out.println("you are calling setName()");
//	}
//	
//	@Before("args(int)")
//	void setAspect1(){
//		System.out.println("you are calling setAge()");
//	}
//	
//	@Before("args(n)")
//	void setAspect3(JoinPoint jp,String n){
//		System.out.println("you are calling setName() "
//				+ "paramete="+n + jp);
//	}
//	
//	@Before("args(a)")
//	void setAspect4(int a){
//		System.out.println("you are calling setAge() "
//				+ "parameter="+a);
//	}
////	
//	@Before("pointCut()")
//	void setAspect5(JoinPoint point){
//		System.out.println(point.getTarget().getClass().getSimpleName());
//	}
	
	@Pointcut("within(com.AOP4.Person)")
	void pointCut() {
		
	}
	
	@Before("pointCut() && args(name,a)")
	void setAspect6(String name,int a) {
		System.out.println(" in setAspect6 name="+name+", age"
				+ a);
	}
}
