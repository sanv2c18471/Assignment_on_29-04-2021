package com.Mappingtypes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	@Id
    private int answer_Id;
    private String answer_Name;
    @ManyToOne
    private Question question;
    
    
    
	public int getAnswer_Id() {
		return answer_Id;
	}
	public void setAnswer_Id(int answer_Id) {
		this.answer_Id = answer_Id;
	}
	public String getAnswer_Name() {
		return answer_Name;
	}
	public void setAnswer_Name(String answer_Name) {
		this.answer_Name = answer_Name;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int answer_Id, String answer_Name, Question question) {
		super();
		this.answer_Id = answer_Id;
		this.answer_Name = answer_Name;
		this.question = question;
	}
    
}
