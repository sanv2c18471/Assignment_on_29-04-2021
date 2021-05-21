package com.hibernate.sql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
public class SqlExample {
 public static void main(String[] args) {
	 Configuration cfg = new Configuration();
	 cfg.configure("com/Employee/Emp.cfg.xml");
	 SessionFactory factory = cfg.buildSessionFactory();
	 Session session=factory.openSession();
	 
	 String query="select * from employee";
     NativeQuery<Object[]> nq= (NativeQuery<Object[]>)session.createQuery(query);
     List<Object[]> list = nq.list(); 
     for (Object[] objects : list) {
		System.out.println(Arrays.toString(objects));
	}
	 session.close();
	 factory.close();
}
}
