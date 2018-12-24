package com.luv2code.springapp;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 Minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneService to get a daily fortune
		return fortuneService.getFortune();
		
	}
}
