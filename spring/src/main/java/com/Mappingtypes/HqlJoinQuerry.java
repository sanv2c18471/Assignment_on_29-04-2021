package com.Mappingtypes;

import org.hibernate.query.*;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HqlJoinQuerry {
 public static void main(String[] args) {
	Configuration conf=new Configuration();
	conf.configure("com/Mappingtypes/hibernate.cfg.xml");
	SessionFactory factory=conf.buildSessionFactory();
	Session session = factory.openSession();
	Transaction ts=session.beginTransaction();
	
	Query q=session.createQuery("SELECT q.question_Id,q.question_Name,a.answer_Name from Question as q INNER JOIN q.answers as a");
    List<Object[]> list= q.getResultList();
    for (Object[] objects : list) {
		System.out.println(Arrays.toString(objects));
	}
	ts.commit();
	session.close();
	factory.close();
	
}
}
