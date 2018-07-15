package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/springinaction/springidol/spring-idol.xml");
		Performer performer = (Performer) ac.getBean("duke");
		performer.perform();
	}

}
