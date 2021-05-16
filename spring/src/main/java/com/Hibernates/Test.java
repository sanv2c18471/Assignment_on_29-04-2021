package com.Hibernates;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/Hibernates/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		//Student stu = (Student) session.get(Student.class, 104);
		//Student stu = (Student) session.load(Student.class, 105);
		//Address addr=(Address)session.get(Address.class,8);
		Address addr=(Address)session.get(Address.class,1);
        System.out.println(addr);
		//System.out.println(addr.getCity()+"-"+addr.getStreet());
        //System.out.println(stu);
        session.close();
        factory.close();
	}

}
