package com.andrei.gym.coach;

import com.andrei.gym.fortune.FortuneService;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	
	
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		return "Spend 30 on batting practice";
	}



	@Override
	public String getDailyFortune() {
		
		return this.fortuneService.getFortune();
	}
}
