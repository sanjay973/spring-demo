package com.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public TrackCoach() {
		
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just do it: " + fortuneService.getFortune();
	}
	
	//bean init-method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside doMyStartupStuff");
	}
	
	//bean destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside doMyCleanupStuff");
	}

}
