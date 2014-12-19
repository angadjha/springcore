package com.java.core.quickstart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainExecution {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloworld");
	helloWorld.printName();
	}
}
