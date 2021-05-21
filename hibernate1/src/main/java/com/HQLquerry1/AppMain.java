package com.HQLquerry1;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppMain {

	public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("com/HQLquerry1/hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	  
	
	/*School sch=new School();
	sch.setId(901);
	sch.setName("JGHSS");
	sch.setCity("Salem");
	
	School sch1=new School();
	sch1.setId(902);
	sch1.setName("SRV");
	sch1.setCity("Namakkal");
	
	School sch2=new School();
	sch2.setId(903);
	sch2.setName("Holy cross");
	sch2.setCity("Ammapet");
	
	Record rec=new Record();
	rec.setSubject("Maths");
	rec.setMarks(98);
	sch.setRecord(rec);
	
	Record rec1=new Record();
	rec1.setSubject("Science");
	rec1.setMarks(99);
	sch1.setRecord(rec1);
	
	Record rec2=new Record();
	rec2.setSubject("English");
	rec2.setMarks(97);
	sch2.setRecord(rec2);*/
	
	
	
	
	Session session=factory.openSession();
    //String query="From School";
	String query="from School as s where s.id=:x or s.city=:y";
    Query q=session.createQuery(query);
    q.setParameter("x",903);
    q.setParameter("y","Ammapet");
    List<School> list=q.list();
    for (School school : list) {
		System.out.println(school.getName()+":"+school.getRecord().getMarks());
	}
    
    
	
    org.hibernate.Transaction ts = session.beginTransaction();
    Query q2 =	session.createQuery("UPDATE School SET city = :a where name = :b");
    q2.setParameter("a","Rasipuram");
    q2.setParameter("b", "SRV");
    int result = q2.executeUpdate();
    System.out.println("Records Updated : "+result);
	
	/*org.hibernate.Transaction ts=session.beginTransaction();
	session.save(sch);
	session.save(sch1);
	session.save(sch2);
	ts.commit();
	session.close();
	factory.close();*/
	
    
	
	
	
	}

}
