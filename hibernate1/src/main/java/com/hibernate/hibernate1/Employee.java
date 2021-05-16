package com.hibernate.hibernate1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
private int id;
private String name;
private String dept;
private int age;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, String dept, int age) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.age = age;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + "]";
}

}
