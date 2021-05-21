package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	@Autowired
	@Qualifier("address1")
  private Address address;

public Address getAddress() {
	return address;
}

//@Autowired
public void setAddress(Address address) {
	System.out.println("setter injection method");
	this.address = address;
}

public Student() {
	super();
	//System.out.println("constructor injection method");
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Student [address=" + address + "]";
}

//@Autowired
public Student(Address address) {
	super();
	this.address = address;
	System.out.println("Parameter constructor injection method");
}
  
}
