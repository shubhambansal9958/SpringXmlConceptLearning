package com.spring.concept.learning;

public class CricketCoach implements Coach {

	private String email;
	private String team;

	private FortuneService fortuneService;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Invoked");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getWorkoutDetail() {
		return "Score 230 runs in a match";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
