package com.ennova_research.academy.basemaven.annotation;

import java.lang.reflect.Method;

/**
 * @author Alberto Ielpo
 */
public class Main {
	public static void main(String[] args) {
		ExampleService s = new ExampleServiceImpl();
		
		/*** check the value of the annotation **/
		Method[] methods = s.getClass().getInterfaces()[0].getMethods();
		for (Method m : methods) {
		    if (m.isAnnotationPresent(ExampleAnnotation.class)) {
		    	ExampleAnnotation ea = m.getAnnotation(ExampleAnnotation.class);
		        System.out.println(ea.value());	//annotation value
		    }
		}
		
		/*** execute the method **/
		s.ex();
		
	}
}
