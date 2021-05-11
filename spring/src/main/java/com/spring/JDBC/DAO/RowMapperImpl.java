package com.spring.JDBC.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.JDBC.Entities.Student;

public class RowMapperImpl implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student st=new Student();
		st.setId(rs.getInt(1));
		st.setName(rs.getString(2));
		st.setCity(rs.getString(3));
		return st;
	}
}
