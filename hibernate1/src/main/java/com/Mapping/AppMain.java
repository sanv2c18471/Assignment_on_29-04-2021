package com.Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMain {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("com/hibernate/hibernate1/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		
		Employee1 emp=new Employee1();
		emp.setEmp_Id(102);
		emp.setEmp_Name("abi");
		emp.setAge(25);
		emp.setCity("Salem");
		
		
		Department dep =new Department();
		dep.setDep_Id(202);
		dep.setDep_Name("HR");
		
		
		emp.setDept(dep);//set dep_id as foreign key in Employee table
		
		Session session=factory.openSession();
		Transaction  ts= session.beginTransaction();
		session.save(emp);
		session.save(dep);
		ts.commit();
		factory.close();
		session.close();
		
		
		
	}

}
