package com.Mappingtypes;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMain {

	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure("com/Mappingtypes/hibernate.cfg.xml");
		SessionFactory factory=conf.buildSessionFactory();
		
		
		
		Question que=new Question();
		que.setQuestion_Id(105);
		que.setQuestion_Name("What is Java?");
		
		
		Answer ans = new Answer();
		ans.setAnswer_Id(601);
		ans.setAnswer_Name("Java is a programmig language");
		ans.setQuestion(que);
		
		Answer ans1 = new Answer();
		ans1.setAnswer_Id(602);
		ans1.setAnswer_Name("Java is a used for app development");
		ans1.setQuestion(que);
		
		Answer ans2 = new Answer();
		ans2.setAnswer_Id(603);
		ans2.setAnswer_Name("Java is a flexi language");
		ans2.setQuestion(que);
		
		List<Answer> answers= new ArrayList<Answer>();
		answers.add(ans);
		answers.add(ans1);
		answers.add(ans2);
		que.setAnswers(answers);
		
		
		Session session = factory.openSession();
		Transaction ts=session.beginTransaction();
		session.save(que);
		//session.save(ans);
		//session.save(ans1);
		//session.save(ans2);
		ts.commit();
		
	    
		Question q=(Question) session.get(Question.class,105);
		System.out.println(q.getQuestion_Name());
		
		
		
		session.close();
		factory.close();
	}

}
