package com.spring.JDBC;

import java.util.ArrayList;
import java.util.List;

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
    
//hardcoded
    //JdbcTemplate jdbc=(JdbcTemplate)context.getBean("jdbctemplate");
    //String query = "insert into Student(id,name,city) values (?,?,?)";
    //int result = jdbc.update(query,104,"Abi","Banglore");
    
    //System.out.println("Records inserted: "+result);
    
   StudentDAO stu1=(StudentDAO) context.getBean("studDAO");
// Multipleinsert
   
//    stu1.saveEmployeeByPreparedStatement(new Student (605,"jam","salem"));
//    stu1.saveEmployeeByPreparedStatement(new Student (603,"hari","Banglore"));
//    stu1.saveEmployeeByPreparedStatement(new Student (604,"praveen","madurai"));
   
   
//Update
    Student student= new Student();
    student.setId(101);
    student.setName("sankari");
    student.setCity("Banglore");
    int result= stu1.update1(student);
    System.out.println(result);
    

//delete
    int result1=stu1.delete(601);
    System.out.println(result1);
    
    
//single select
    Student student1= stu1.getStudent(101);
    System.out.println(student1);
    
//Multiple select  
    List<Student> studentslist=stu1.getAllStudents();
    for(Student s:studentslist) {
    	System.out.println(s);
    }

//    Student student= new Student();
//    student.setId(301);
//    student.setName("jerry");
//    student.setCity("madurai");
//    student.setId(401);
//    student.setName("jam");
//    student.setCity("namakkal");
//    int result = stu1.insert(student);
//    System.out.println(result);
    
	}

}
