package com.hibernate.hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test_getorload {
public static void main(String[] args) {
	Configuration cfg= new Configuration();
	cfg.configure("com/hibernate/hibernate1/hibernate.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	Session session=factory.openSession();
	Employee emp =(Employee)session.get(Employee.class, 109);//get() object not found  its returns null
	Employee emp1 =(Employee)session.load(Employee.class, 105);//load() there is no id in database it returns object not found exception 
	System.out.println(emp1);
	System.out.println(emp);
	session.close();
    factory.close();
}
}
