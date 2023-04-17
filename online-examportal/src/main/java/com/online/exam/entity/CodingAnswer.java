package com.online.exam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CodingAnswer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Aid", unique =true, nullable = false)
	private Integer Aid;
	private String Acontent;
	private boolean Acorrect;
	
	@ManyToOne
	private CodingQuestion Aquestion;

	public CodingAnswer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CodingAnswer(Integer aid, String acontent, boolean acorrect, CodingQuestion aquestion) {
		super();
		Aid = aid;
		Acontent = acontent;
		Acorrect = acorrect;
		Aquestion = aquestion;
	}

	public Integer getAid() {
		return Aid;
	}

	public void setAid(Integer aid) {
		Aid = aid;
	}

	public String getAcontent() {
		return Acontent;
	}

	public void setAcontent(String acontent) {
		Acontent = acontent;
	}

	public boolean isAcorrect() {
		return Acorrect;
	}

	public void setAcorrect(boolean acorrect) {
		Acorrect = acorrect;
	}

	public CodingQuestion getAquestion() {
		return Aquestion;
	}

	public void setAquestion(CodingQuestion aquestion) {
		Aquestion = aquestion;
	}
	
	

}
