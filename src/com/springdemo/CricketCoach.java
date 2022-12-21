package com.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;

	private String emailAddress;
	private String team;
	
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket Coach - inside setter email Addresss");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("Cricket Coach - inside setter team");
		this.team = team;
	}


	public CricketCoach() {
		System.out.println("Cricketout - inside no-arg");
	}


	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricketout - inside setter method");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
	
		return "Practice fast bowling for 15 Minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
