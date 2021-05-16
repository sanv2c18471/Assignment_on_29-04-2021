package com.Hibernates;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Appmain {

	public static void main(String[] args) throws IOException {
		System.out.println("project started!");
		Configuration cfg = new Configuration();
		cfg.configure("com/Hibernates/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory.isClosed());
		Student stu = new Student();
		stu.setId(105);
		stu.setName("Jac");
		stu.setCity("Delhi");
		System.out.println(stu);

		Address address = new Address();
		address.setStreet("KKk nagar");
		address.setCity("Mumbai");
		address.setLockdown(false);
		address.setLockdownDate(new Date());
		address.setPrice(200.90);
		FileInputStream fis = new FileInputStream("src/main/java/com/Hibernates/download.png");
		byte[] image = new byte[fis.available()];
		fis.read(image);
		address.setImage(image);
		System.out.println(address);
		
		
		// Session session= factory.getCurrentSession();
		Session session = factory.openSession();
		Transaction ts = session.beginTransaction();
		session.save(stu);
		session.save(address);
		ts.commit();
		session.close();

	}

}
