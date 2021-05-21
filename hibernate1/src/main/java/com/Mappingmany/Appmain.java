package com.Mappingmany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Appmain {
  public static void main(String[] args) {
	  Configuration conf= new Configuration();
		 conf.configure("com/Mappingmany/hibernatemanytomany.cfg.xml");
		 SessionFactory factory=conf.buildSessionFactory();
		 
		 Student stu=new Student();
		 stu.setStudent_Id(1);
		 stu.setStudent_Name("sham");
		 Student stu1=new Student();
		 stu1.setStudent_Id(2);
		 stu1.setStudent_Name("priya");
		 
		 
		 Assignment ass=new Assignment();
		 ass.setAssignment_Id(101);
		 ass.setAssignment_Name("Maths");
		 Assignment ass1=new Assignment();
		 ass1.setAssignment_Id(102);
		 ass1.setAssignment_Name("Science");
		 
		 List<Student> studentList=new ArrayList<Student>();
		 studentList.add(stu);
		 studentList.add(stu1);
		 
		 List<Assignment> assignmentList=new ArrayList<Assignment>();
		 assignmentList.add(ass);
		 assignmentList.add(ass1);
		 
		 stu.setAssignments(assignmentList);
		 ass.setStudents(studentList);
		 stu1.setAssignments(assignmentList);
		 ass1.setStudents(studentList);
		 
		 
		 
		 
		 Session session=factory.openSession();
		 Transaction ts= session.beginTransaction();
		 session.save(stu);
		 session.save(stu1);
		 session.save(ass);
		 session.save(ass1);
		 ts.commit();
		 factory.close();
		 
		


		 
}
}
