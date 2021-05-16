package com.hibernate.hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/hibernate1/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory(); 
		System.out.println(factory.isClosed());
		Employee emp = new Employee();
		emp.setId(302);
		emp.setName("harry");
		emp.setDept("Development");
		emp.setAge(29);
		System.out.println(emp);
		//Session session= factory.getCurrentSession();
		
		  Session session= factory.openSession();
		  Transaction ts=session.beginTransaction(); 
		  session.save(emp); 
		  ts.commit();
		  session.close();
		 
    }
}
