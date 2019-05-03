package com.ran.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortunseSerice;
	
	public BaseballCoach(FortuneService theFortunseSerice) {
		fortunseSerice = theFortunseSerice;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortunseSerice.getFortune();
	}

}
