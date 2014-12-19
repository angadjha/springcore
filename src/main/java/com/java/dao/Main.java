package com.java.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.Event;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
		EventDao dao=(EventDao)ctx.getBean("edao");  
	   dao.saveEmployee();
	   
	   System.out.println("------Listing Multiple Records--------" );
	      List<Event> students = dao.saveEmployee();
	      for (Event record : students) {
	         System.out.print("ID : " + record.getId() );
	         System.out.print(", Name : " + record.getName() );   
	      }

	    
	}
}
