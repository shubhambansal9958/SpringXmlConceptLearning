package com.spring.concept.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApplicationController {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		System.out.println("Alpha Coach");
		Coach coachAlpha = context.getBean("myCoach", Coach.class);

		System.out.println("Beta Coach");
		Coach coachBeta = context.getBean("myCoach", Coach.class);

		if (coachAlpha == coachBeta) {
			System.out.println("Both are same objects");
		} else {
			System.out.println("Different Objects");
		}
		
		context.close();
	}

}
