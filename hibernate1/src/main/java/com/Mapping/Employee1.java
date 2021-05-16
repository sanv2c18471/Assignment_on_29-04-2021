package com.Mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee1 {
	@Id
   private int emp_Id;
   private String emp_Name;
   private int age;
   private String city;
   @OneToOne
  // @JoinColumn(name="d_Id")
   private Department dept;
   
   
public int getEmp_Id() {
	return emp_Id;
}
public void setEmp_Id(int emp_Id) {
	this.emp_Id = emp_Id;
}
public String getEmp_Name() {
	return emp_Name;
}
public void setEmp_Name(String emp_Name) {
	this.emp_Name = emp_Name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Employee1() {
	super();
	// TODO Auto-generated constructor stub
}
public Department getDept() {
	return dept;
}
public void setDept(Department dept) {
	this.dept = dept;
}
public Employee1(int emp_Id, String emp_Name, int age, String city) {
	super();
	this.emp_Id = emp_Id;
	this.emp_Name = emp_Name;
	this.age = age;
	this.city = city;
}
   
   
}
