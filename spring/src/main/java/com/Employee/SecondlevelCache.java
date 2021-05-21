package com.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondlevelCache {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("com/Employee/Emp.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	
	session.close();
	factory.close();
}
}
