package com.spring.JDBC1.DAO;

import java.util.List;
import com.spring.JDBC1.Employee;

public interface EmployeeDAO {
	public int insert(Employee employee);//insert
	
	public Boolean saveEmployeeByPreparedStatement(final Employee employee);//multiple insert
	
	public int update1(Employee employee);//update
	
	public int delete(int id);//delete
	
	 public Employee getEmployee(int id);// select for single
	 
	 public List<Employee> getAllEmployees();//select for multiple
	 
}
