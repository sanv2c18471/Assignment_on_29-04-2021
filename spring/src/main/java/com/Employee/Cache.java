package com.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Cache {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("com/Employee/Emp.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
    Employee emp=session.get(Employee.class,1);
	System.out.println(emp.getId()+" "+emp.getName());
	Employee emp1=session.get(Employee.class,1);
	System.out.println(emp1.getId()+" "+emp1.getName());
	session.close();
	factory.close();
}
}
