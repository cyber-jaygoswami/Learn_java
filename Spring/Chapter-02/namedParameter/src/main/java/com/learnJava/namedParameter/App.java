package com.learnJava.namedParameter;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class App 
{
    public static void main( String[] args )
    {
//        DriverManagerDataSource;
//        JdbcTemplate;
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	JdbcTemplate template = (JdbcTemplate)context.getBean("jdbcTemplate");
    	
    	
    	// Positional Parameter method
//    	String insert_query = "insert into students(id,name,city) values(?,?,?)";
//    	int row_inserted = template.update(insert_query,7,"max","LA");
//    	if(row_inserted > 0) {
//    		System.out.println(row_inserted + " rows inserted :)");
//    	}
//    	else {
//    		System.out.println("Some error!!!");
//    	}
    	
    	
    	// Named Parameter method
//    	NamedParameterJdbcTemplate;
    	NamedParameterJdbcTemplate namedJdbcTemplate = (NamedParameterJdbcTemplate)context.getBean("namedJdbcTemplate");
    	
    	String insert_query = "insert into students values(:id,:name,:city)";
    	Map<String,String> map = new HashMap<String,String>();
    	map.put("id","8");
    	map.put("name","Heath");
    	map.put("city", "NYC");
    	
    	
    	
    	int row_inserted = namedJdbcTemplate.update(insert_query,map);
    	if(row_inserted > 0) {
    		System.out.println(row_inserted + " rows inserted :)");
    	}
    	else {
    		System.out.println("Some error!!!");
    	}
    	
    	
    	
    }
}
