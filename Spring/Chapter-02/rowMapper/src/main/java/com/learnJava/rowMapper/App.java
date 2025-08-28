package com.learnJava.rowMapper;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        JdbcTemplate template = (JdbcTemplate)context.getBean("jdbcTemplate");
        
        String select_query = "select * from students";
        List<Student> std_list = template.query(select_query, new MapMayRows());
        
        System.out.println(std_list);
    }
}
