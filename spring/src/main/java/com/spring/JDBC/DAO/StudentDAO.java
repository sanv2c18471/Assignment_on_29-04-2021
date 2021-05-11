package com.spring.JDBC.DAO;

import java.util.List;

import com.spring.JDBC.Entities.Student;

public interface StudentDAO {
 public int insert(Student student);//insert

// public Boolean saveEmployeeByPreparedStatement(final Student student);//multiple insert
 
 public int update1(Student student);//update
 
 public int delete(int id);//delete
 
 public Student getStudent(int id);// select for single
 
 public List<Student> getAllStudents();//select for multiple
 

}
