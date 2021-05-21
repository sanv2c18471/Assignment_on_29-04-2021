package com.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Appmain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/HQL/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		/*Person per = new Person();
		per.setId(101);
		per.setName("Sham");
		per.setCity("Salem");

		Person per1 = new Person();
		per1.setId(102);
		per1.setName("Ram");
		per1.setCity("Erode");
		
		Person per2 = new Person();
		per2.setId(103);
		per2.setName("Priya");
		per2.setCity("Erode");
		
		Person per3 = new Person();
		per3.setId(104);
		per3.setName("Dheya");
		per3.setCity("Madurai");
		
		Person per4 = new Person();
		per4.setId(105);
		per4.setName("Mukul");
		per4.setCity("Banglore");

		Certificate cer = new Certificate();
		cer.setCourse("Spring framework");
		cer.setDuration("6 months");
		per.setCerti(cer);

		Certificate cer1 = new Certificate();
		cer1.setCourse("Hibernate");
		cer1.setDuration("2 months");
		per1.setCerti(cer1);
		
		Certificate cer2 = new Certificate();
		cer2.setCourse("Java");
		cer2.setDuration("3 months");
		per2.setCerti(cer2);
		
		Certificate cer3 = new Certificate();
		cer3.setCourse("SQL");
		cer3.setDuration("4 months");
		per3.setCerti(cer3);
		
		Certificate cer4 = new Certificate();
		cer4.setCourse("Spring Boot");
		cer4.setDuration("7 months");
		per4.setCerti(cer4);*/
		
		
        
		Session session = factory.openSession();
		//String query = "from Person"; 
		//String query = "from Person where city='Salem'";//here using Entity name
		//String query = "from Person where city= :x";//projection is like alias
	    //String query = "from Person as p where p.id=102 and p.name='Ram' ";
	    String query = "from Person as p where p.id= :c and p.name= :d ";
		Query q = session.createQuery(query);
		q.setParameter("c", 102);
		q.setParameter("d", "Ram");
		List<Person> list = q.list();
		for (Person person : list) {
			System.out.println(person.getName() +":"+ person.getCerti().getCourse());
		}
		
		
		
		
		
		  /*Transaction ts = session.beginTransaction(); 
		  Query q1 = session.createQuery("delete from Person as p where p.city='Madurai'"); 
		  int result=q1.executeUpdate(); 
		  System.out.println("Records deleted : "+result);
		  ts.commit();
		  session.close();
		  factory.close();*/
		 
        //update HQL
		/*Transaction ts = session.beginTransaction();
	    Query q2 =	session.createQuery("UPDATE Person SET city = :a where name = :b");
	    q2.setParameter("a","Chennai");
	    q2.setParameter("b", "Mukul");
	    int result = q2.executeUpdate();
	    System.out.println("Records Updated : "+result);*/
	    
	    
	    
		
		
	
		/*session.save(per);
		session.save(per1);
		session.save(per2);
		session.save(per3);
		session.save(per4);
		ts.commit();
		session.close();
		factory.close();*/
		

	}

}
