package com.luv2code.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		//load the Spring configuation file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		
		//Get the bean from spring container
		Coach theCoach = context.getBean("theCoach", Coach.class);
		
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		
		//Close the context
		context.close();

	}

}
