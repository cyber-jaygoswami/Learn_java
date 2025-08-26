package com.learnJava.ResultSetDemonstrate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class ObjectMapper implements ResultSetExtractor<List<Student>>{

	@Override
	public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<Student> list = new ArrayList<Student>();
		
		while(rs.next()) {
			Student s = new Student();
			
			
			s.setId(rs.getInt("id"));
			s.setName(rs.getString("name"));
			s.setCity(rs.getString("city"));
			
			list.add(s);
			
		}
		return list;
	}

}
