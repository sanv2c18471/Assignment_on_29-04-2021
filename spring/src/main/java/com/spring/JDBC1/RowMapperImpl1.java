package com.spring.JDBC1;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl1 implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee ep = new Employee();
		ep.setId(rs.getInt(1));
		ep.setName(rs.getString(2));
		ep.setCity(rs.getString(3));
		return ep;
	}

}
