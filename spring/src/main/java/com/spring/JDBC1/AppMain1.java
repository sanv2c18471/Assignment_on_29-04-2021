package com.spring.JDBC1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.JDBC.Entities.Student;
import com.spring.JDBC1.DAO.EmployeeDAO;

public class AppMain1 {
	public static void main(String[] args) {
		System.out.println("welcome spring JDBC");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/JDBC1/config.xml");
//		 JdbcTemplate jdbc=(JdbcTemplate)context.getBean("jdbctemplate1");
//		 String query = "insert into Employee(id,name,city) values (?,?,?)";
//	    int result = jdbc.update(query,501,"harshitha","Delhi");
//
//		System.out.println("Records inserted: "+result);

		EmployeeDAO employ = (EmployeeDAO) context.getBean("empDAO");
//multiple insert	
		
//		employ.saveEmployeeByPreparedStatement(new Employee(301,"ganga","mettur"));
//		employ.saveEmployeeByPreparedStatement(new Employee(302,"kaviya","Namakkal"));
//		employ.saveEmployeeByPreparedStatement(new Employee(303,"logesh","dindukal"));
//		


//update		
		Employee emp = new Employee();
		emp.setId(201);
	    emp.setName("anu");
		emp.setCity("bombay");
		int result = employ.update1(emp);
		System.out.println(result);
		
//delete
		int result1=employ.delete(501);
	    System.out.println(result1);
	   
	    
//single select
	    Employee emp1= employ.getEmployee(101);
	    System.out.println(emp1);
	    
	    
//Multiple select  
//	    List<Employee> employeeslist=employ.getAllEmployees();
//	    for(Employee e:employeeslist) {
//	    	System.out.println(e);
//	    }
	}

}
