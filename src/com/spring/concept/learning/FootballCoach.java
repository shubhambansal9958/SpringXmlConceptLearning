package com.spring.concept.learning;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;

	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public void startUp() {
		System.out.println("Football Coach -> startUp()");
	}
	
	public void cleanUp() {
		System.out.println("Football Coach -> cleanUp()");
	}

	@Override
	public String getWorkoutDetail() {
		return "2 Hrs at football ground";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	

}
