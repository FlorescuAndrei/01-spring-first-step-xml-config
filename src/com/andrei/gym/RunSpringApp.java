package com.andrei.gym;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.andrei.gym.coach.Coach;
import com.andrei.gym.coach.CricketCoach;

//Spring xml configuration. Inversion of control . Dependency Injection.

public class RunSpringApp {

	public static void main(String[] args) {
		
		//load Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//Coach theCoach = context.getBean("myCricketCoach", Coach.class);     
		//Use interface name instead class name but doesn't work with method inside CricketCoach that are not in the interface Coach
		CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class); 
		System.out.println(theCricketCoach.getDailyWorkout());
		
		System.out.println(theCricketCoach.getDailyFortune());
		
		System.out.println(theCricketCoach.getEmailAddress());
		
		
		System.out.println(theCricketCoach.getLogo());
		
		
		Coach theCoach=context.getBean("myTrackCoach", Coach.class);
		
		
		Coach alphaCoach=context.getBean("myTrackCoach", Coach.class);
		
		//Bean scope. Check if they are the same (singleton vs prototype scope)
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPointing to the same object " + result);
		System.out.println("\nMemory location for theCoach " + theCoach);
		System.out.println("\nMemory location for theCoach " + theCoach);
		
		
		//Bean life cycle : for prototype scope the destroy method is not call
		
		
		
		
		context.close();

	}

}
