package com.HQLquery;

import org.hibernate.query.*;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainJoinquerry {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/HQLquery/hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction ts= session.beginTransaction();
		Query q = session.createQuery("SELECT p.id,p.name,a.accountNo,a.bankName from Person as p INNER JOIN p.accountnumbers as a");
		List<Object[]>list=q.getResultList();
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
		}
		ts.commit();
		session.close();
		factory.close();
		
		
	}

}
