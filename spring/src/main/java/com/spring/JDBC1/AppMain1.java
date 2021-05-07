package com.spring.JDBC1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

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
		Employee emp = new Employee();
		emp.setId(201);
		emp.setName("tom");
		emp.setCity("salem");
		int result = employ.insert(emp);
		System.out.println(result);

	}

}
