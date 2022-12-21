package com.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//constructor
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
public String getDailyWorkout() {
	
	return "Spend 30 minutes on Batting Practice";
}

@Override
public String getDailyFortune() {
	// TODO Auto-generated method stub
	return fortuneService.getFortune();
}
}
