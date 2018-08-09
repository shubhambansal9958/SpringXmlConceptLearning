package com.spring.concept.learning;

public class BaseballCoach implements Coach{
	
	
	private FortuneService fortuneService;
	
	
	public BaseballCoach(FortuneService fortuneService) {
		System.out.println("Baseball Coach Constructor Invoked : "+this);
		this.fortuneService = fortuneService;
	}

	@Override
	public String getWorkoutDetail() {
		return "30 mins hard workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
