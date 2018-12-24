package com.luv2code.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load the Spring configuation file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		//Get the bean from spring container
		Coach theCoach = context.getBean("theCoach", Coach.class);
		Coach alphaCoach = context.getBean("theCoach", Coach.class);
		
		//Compare if both bean references are same
		boolean result = (theCoach == alphaCoach);
		
		//print the results
		System.out.println("\nPointing to the same Object: " + result);
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		
		//close the context
		context.close();

	}

}
