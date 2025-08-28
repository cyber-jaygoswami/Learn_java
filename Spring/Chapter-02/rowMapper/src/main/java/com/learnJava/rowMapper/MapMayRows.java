package com.learnJava.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapMayRows implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student sobj = new Student();
		
		sobj.setId(rs.getInt("id"));
		sobj.setName(rs.getString("name"));
		sobj.setCity(rs.getString("city"));
		return sobj;
	}

}
