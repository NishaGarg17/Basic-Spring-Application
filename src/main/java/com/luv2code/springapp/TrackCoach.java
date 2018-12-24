package com.luv2code.springapp;

public class TrackCoach implements Coach{
	
	private FortuneService fortuneService;
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneService to get a daily fortune
		return fortuneService.getFortune();
		
	}
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: Inside method doMyStartupStuff");
	}
	//add an destroy method
	public void doMyCleanUpStuffYoYo() {
		System.out.println("TrackCoach: Inside method doMyCleanUpStuffYoYo");
	}
}
