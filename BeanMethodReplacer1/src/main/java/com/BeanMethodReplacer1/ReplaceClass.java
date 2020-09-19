package com.BeanMethodReplacer1;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class ReplaceClass implements MethodReplacer{
	
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		return "method replace ho gya   "+method.getName()+" have method args"+args.length;
	}
	
}
