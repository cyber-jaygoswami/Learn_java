package com.learnJava.ResultSetDemonstrate;

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
    	
    	String select_query = "select * from students";
    	
    	System.out.println(template.query(select_query, new ObjectMapper()));
    }
}
