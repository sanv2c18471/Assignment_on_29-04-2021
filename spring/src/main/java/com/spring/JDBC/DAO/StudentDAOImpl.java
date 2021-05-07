package com.spring.JDBC.DAO;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.JDBC.Entities.Student;

public class StudentDAOImpl implements StudentDAO{
	
	private JdbcTemplate jdbctemplate;
	
	
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}


	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}


	public StudentDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "StudentDAOImpl [jdbctemplate=" + jdbctemplate + "]";
	}


	public int insert(Student student) {
		// TODO Auto-generated method stub
		String query = "insert into Student(id,name,city) values (?,?,?)";
		int result = this.jdbctemplate.update(query,student.getId(),student.getName(),student.getCity());
		return result;
	}

}
