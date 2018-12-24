package com.luv2code.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrive bean from spring container
		Coach coach = context.getBean("myCoach",Coach.class);
	    //Call methods on the bean
		System.out.println(coach.getDailyWorkout());
		//call to get daily fortune method on the bean
		System.out.println(coach.getDailyFortune());
	   //close the context
		context.close();
	}

}
