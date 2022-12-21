package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//Retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("Pointing to the same result " + result);
		
		/**
		 if bean scope is singleton - result is true
		 singleton means same object is returned for every request
		 
		 if bean scope is prototype result is false,
		 prototype means new object is created for every request
		 */
		
		
		context.close();

	}

}
