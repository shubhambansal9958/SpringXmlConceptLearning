package com.spring.concept.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApplicationController {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		
		Coach coach = context.getBean("myCoach", Coach.class);
		
		System.out.println("IntermediateStatement");
		
		context.close();
	}
}
