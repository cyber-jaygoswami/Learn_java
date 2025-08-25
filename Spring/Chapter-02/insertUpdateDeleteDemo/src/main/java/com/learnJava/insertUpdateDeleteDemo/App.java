package com.learnJava.insertUpdateDeleteDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class App 
{
    public static void main( String[] args )
    {
//        DriverManagerDataSource;
//        JdbcTemplate;
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	JdbcTemplate template = (JdbcTemplate)context.getBean("jdbcTemplate");
    	
    	
    	// Insert operation -----------------------------------
//    	String insert_query = "insert into students values(?,?,?)";
//    	
//    	int rowInserted = template.update(insert_query,9,"Raj","Karachi");
//    	if(rowInserted > 0) {
//    		System.out.println(rowInserted + " rows inserted :)");
//    	}
//    	else {
//    		
//    		System.out.println("Error !!!");
//    	}
    	
    	
    	
    	// Update operation -----------------------
    	String update_query = "update students set name=?,city=?  where id=9";
    	
    	int rowUpdated = template.update(update_query,"Raj","Lahore");
    	if(rowUpdated > 0) {
    		System.out.println(rowUpdated + " Raj location changed  :)");
    	}
    	else {
    		
    		System.out.println("Error !!!");
    	}		
    	
    	
    	
    	// Delete operation --------------------
    	// Homework :)
    	
    	
    }
}
