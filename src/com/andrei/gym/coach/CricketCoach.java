package com.andrei.gym.coach;

import com.andrei.gym.fortune.FortuneService;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	
	private String logo;
	
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside method: setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside method: setter method - setEmailAdress");
		this.emailAddress = emailAddress;
	}

	
	public String getEmailAddress() {
		return emailAddress;
	}

	
	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	

}
