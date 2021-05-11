package com.spring.JDBC.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;

import com.spring.JDBC.Entities.Student;

public class StudentDAOImpl implements StudentDAO {

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

	
//insert
	public int insert(Student student) {
		// TODO Auto-generated method stub
		String query = "insert into Student(id,name,city) values (?,?,?)";
		int result = this.jdbctemplate.update(query, student.getId(), student.getName(), student.getCity());
		return result;
	}
//Mutiple insert
//	public Boolean saveEmployeeByPreparedStatement(final Student student) {
//		String query = "insert into student values(?,?,?)";
//		return jdbctemplate.execute(query, new PreparedStatementCallback<Boolean>() {
//			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
//				ps.setInt(1, student.getId());
//				ps.setString(2, student.getName());
//				ps.setString(3, student.getCity());
//				return ps.execute();
//			}
//		});
//	}

	
	
//Update
	public int update1(Student student) {
		// TODO Auto-generated method stub
		String query = "update student set name=?,city=? where id=?";
		int result = this.jdbctemplate.update(query, student.getName(), student.getCity(), student.getId());
		return result;

	}

	
//delete
	public int delete(int id) {
		// TODO Auto-generated method stub
		String query = "delete from student where id=?";
		int result = this.jdbctemplate.update(query, id);
		return result;
	}

	
//single select
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbctemplate.queryForObject(query, rowMapper, id);
		return student;
	}

	
//multiple select
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		String query = "select * from student";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		List<Student> student = this.jdbctemplate.query(query, rowMapper);
		return student;
	}

}
