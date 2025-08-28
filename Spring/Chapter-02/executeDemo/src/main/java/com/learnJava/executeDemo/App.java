package com.learnJava.executeDemo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

/**

execute
public void execute(String query)									: is used to execute DDL query(Create, Alter, Drop, Truncate).
public void execute(String sql,PreparedStatementCallback action)	: executes the query by using PreparedStatement callback.

 
It can be used to run any SQL statement, including CREATE TABLE, ALTER TABLE, DROP TABLE, CREATE INDEX, etc., 
as well as INSERT, UPDATE, and DELETE operations where you don't need a return value like the number of affected rows 
 (though update methods are typically preferred for DML).
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	JdbcTemplate template = (JdbcTemplate)context.getBean("jdbcTemplate");
    	
//    	template.execute("create table emp(id int, name varchar(255));");
    	
    	
    	String query = "insert into emp value(?,?);";
    	
    	template.execute(query,new PreparedStatementCallback<Boolean>() {
    		public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException {
    			ps.setInt(1, 21);
    			ps.setString(2, "Jay");
    			return ps.execute();
    		}
    	});
    	
        
    }
}
