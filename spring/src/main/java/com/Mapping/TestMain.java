package com.Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {
  public static void main(String[] args) {
	 Configuration conf= new Configuration();
	 conf.configure("com/Hibernates/hibernate.cfg.xml");
	 SessionFactory factory=conf.buildSessionFactory();
	 
	 
	 Question question= new Question();
	 question.setQuestion_Id(1217);
	 question.setQuestion("What is java?");
	 
	 
	 Answer answer = new Answer();
	 answer.setAnswer_Id(348);
	 answer.setAnswer("Java is Programming language");
	 
	 question.setAnswer(answer);//
	 //answer.setQuestion(question);//
	 Session session=factory.openSession();
	 Transaction ts= session.beginTransaction();
	 session.save(question);
	 session.save(answer);
	 ts.commit();
	 factory.close();
	 
}
}
