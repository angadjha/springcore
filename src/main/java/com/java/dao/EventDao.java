/*package com.java.dao;

import java.awt.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.java.Event;
import com.java.service.EventService;

public class EventDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public java.util.List<Event> saveEmployee(){  
	    String query="insert into event values( "
	   	+ "'"+e.getId()+"','"+e.getName()+"')" ;
		String query = "select * from event";
		//System.out.println(query);
	    //jdbcTemplate.execute(query);
		java.util.List<Event> ev =  jdbcTemplate.query(query, new EventService());
	    		//jdbcTemplate.update(query);  
		return ev;
	}  
	
	
}
*/