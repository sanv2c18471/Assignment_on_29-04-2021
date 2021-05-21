package com.HQLquery;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMain {

	public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("com/HQLquery/hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	
	Person per=new Person();
	per.setId(1);
	per.setName("Nady");
	per.setCity("Banglore");
	
	
	AccountNumber ac=new AccountNumber();
	ac.setAccountNo(654341231);
	ac.setBankName("Canara bank");
	ac.setPerson(per);
	
	AccountNumber ac1=new AccountNumber();
	ac1.setAccountNo(611245875);
	ac1.setBankName("State bank");
	ac1.setPerson(per);
	
	List<AccountNumber> accountnumbers= new ArrayList<AccountNumber>();
	accountnumbers.add(ac);
	accountnumbers.add(ac1);
	per.setAccountnumbers(accountnumbers);
	
    Session session=factory.openSession();
    Transaction ts=session.beginTransaction();
    session.save(per);
    session.save(ac);
    session.save(ac1);
    ts.commit();
    session.close();
    factory.close();
	
	

	}

}
