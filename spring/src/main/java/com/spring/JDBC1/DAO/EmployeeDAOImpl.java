package com.spring.JDBC1.DAO;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.JDBC1.Employee;

public class EmployeeDAOImpl implements EmployeeDAO  {
	private JdbcTemplate jdbctemplate;
	

	@Override
	public String toString() {
		return "EmployeeDAOImpl [jdbctemplate=" + jdbctemplate + "]";
	}


	public int insert(Employee employee) {
		// TODO Auto-generated method stub
		String query = "insert into Employee(id,name,city) values (?,?,?)";
		int result = this.jdbctemplate.update(query,employee.getId(),employee.getName(),employee.getCity());
		return result;
	}


	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}


	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

}
