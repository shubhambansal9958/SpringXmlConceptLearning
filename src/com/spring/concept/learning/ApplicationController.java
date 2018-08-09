package com.spring.concept.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationController {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach bean = context.getBean("myCoach", Coach.class);

		if (bean != null) {
			System.out.println(bean.getWorkoutDetail());
			System.out.println(bean.getDailyFortune());
		}

		Coach bean2 = context.getBean("myCoach2", Coach.class);

		if (bean2 != null) {
			System.out.println(bean2.getWorkoutDetail());
			System.out.println(bean2.getDailyFortune());

			CricketCoach cricketCoach = (CricketCoach) bean2;
			System.out.println(cricketCoach.getEmail());
			System.out.println(cricketCoach.getTeam());
		}

		CricketCoach cricketCoach2 = context.getBean("myCricketCoach", CricketCoach.class);

		if (bean2 != null) {
			System.out.println(cricketCoach2.getWorkoutDetail());
			System.out.println(cricketCoach2.getDailyFortune());

			System.out.println(cricketCoach2.getEmail());
			System.out.println(cricketCoach2.getTeam());
		}

		context.close();
	}

}
