package com.Mappingtypes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Question {
	@Id
      private int question_Id;
      private String question_Name;
      @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
      private List<Answer> answers;
	public int getQuestion_Id() {
		return question_Id;
	}
	public void setQuestion_Id(int question_Id) {
		this.question_Id = question_Id;
	}
	public String getQuestion_Name() {
		return question_Name;
	}
	public void setQuestion_Name(String question_Name) {
		this.question_Name = question_Name;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int question_Id, String question_Name, List<Answer> answers) {
		super();
		this.question_Id = question_Id;
		this.question_Name = question_Name;
		this.answers = answers;
	}
      
      
}
