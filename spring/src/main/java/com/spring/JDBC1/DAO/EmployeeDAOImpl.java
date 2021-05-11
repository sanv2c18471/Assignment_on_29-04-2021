package com.spring.JDBC1.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;

import com.spring.JDBC1.Employee;
import com.spring.JDBC1.RowMapperImpl1;

public class EmployeeDAOImpl implements EmployeeDAO {
	private JdbcTemplate jdbctemplate;

	@Override
	public String toString() {
		return "EmployeeDAOImpl [jdbctemplate=" + jdbctemplate + "]";
	}

	public int insert(Employee employee) {
		// TODO Auto-generated method stub
		String query = "insert into Employee(id,name,city) values (?,?,?)";
		int result = this.jdbctemplate.update(query, employee.getId(), employee.getName(), employee.getCity());
		return result;
	}

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	public Boolean saveEmployeeByPreparedStatement(final Employee employee) {
		// TODO Auto-generated method stub
		String query = "insert into employee values(?,?,?)";
		return jdbctemplate.execute(query, new PreparedStatementCallback<Boolean>() {
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, employee.getId());
				ps.setString(2, employee.getName());
				ps.setString(3, employee.getCity());
				return ps.execute();
			}
		});
	}

	public int update1(Employee employee) {
		// TODO Auto-generated method stub
		String query = "update Employee set name=?,city=? where id=?";
		int result = this.jdbctemplate.update(query, employee.getName(), employee.getCity(), employee.getId());
		return result;
	}

	public int delete(int id) {
		String query = "delete from Employee where id=?";
		int result = this.jdbctemplate.update(query, id);
		return result;
	}

	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		String query = "select * from Employee where id=?";
		RowMapper<Employee> rowMapper = new RowMapperImpl1();
		Employee employee = this.jdbctemplate.queryForObject(query, rowMapper, id);
		return employee;

	}

//	public List<Employee> getAllEmployees() {
//		// TODO Auto-generated method stub
//		String query = "select * from Employee";
//		RowMapper<Employee> rowMapper = new RowMapperImpl1();
//		List<Employee> employee = this.jdbctemplate.query(query, rowMapper);
//		return employee;
//
//	}
}
