package com.Employee;

import org.hibernate.query.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.cfg.Configuration;

public class EmpMain {
EhcacheRegionFactory
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/Employee/Emp.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		/*
		 * Employee emp=new Employee(); emp.setId(1); emp.setName("Abi");
		 * emp.setCity("chennai"); emp.setDesignation("HR");
		 */
		
		
		Session session = factory.openSession();
		Query q=session.createQuery("FROM Employee");//pagenation
		q.setFirstResult(10);
		q.setMaxResults(10);
	    List<Employee>list = q.list();
	    for (Employee employee : list) {
		System.out.println(employee.getName()+" "+employee.getDesignation());
	}
		//Transaction ts = session.beginTransaction();
		//session.save(emp);
		//ts.commit();
		session.close();
		factory.close();
	}

}
