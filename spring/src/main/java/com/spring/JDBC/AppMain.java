package com.spring.JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.JDBC.DAO.StudentDAO;
import com.spring.JDBC.Entities.Student;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("welcome spring JDBC");
    
    ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/JDBC/config.xml");
    //JdbcTemplate jdbc=(JdbcTemplate)context.getBean("jdbctemplate");
    //String query = "insert into Student(id,name,city) values (?,?,?)";
    //int result = jdbc.update(query,104,"Abi","Banglore");
    
    //System.out.println("Records inserted: "+result);
    
    StudentDAO stu1=(StudentDAO) context.getBean("studDAO");
    Student student= new Student();
    student.setId(201);
    student.setId(202);
    student.setId(203);
    student.setName("tom");
    student.setName("jerry");
    student.setName("harry");
    student.setCity("salem");
    student.setCity("Namakkal");
    student.setCity("Trichy");
    int result = stu1.insert(student);
    System.out.println(result);
    
	}

}
