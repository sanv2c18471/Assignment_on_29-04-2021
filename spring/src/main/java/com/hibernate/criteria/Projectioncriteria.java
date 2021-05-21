package com.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.Employee.Employee;

public class Projectioncriteria {
public static void main(String[] args) {
	Configuration conf=new Configuration();
	conf.configure("com/Employee/Emp.cfg.xml");
	SessionFactory factory=conf.buildSessionFactory();
	Session session=factory.openSession();
	
	Criteria  criteria=session.createCriteria(Employee.class);
	//criteria.add(Restrictions.eq("designation", "HR"));
	criteria.add(Restrictions.gt("id", 20));
	List<Employee> list = criteria.list();
	for (Employee employee : list) {
		System.out.println(employee.getName());
	}
	session.close();
	factory.close();
}
}
