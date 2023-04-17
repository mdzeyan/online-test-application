package com.online.exam.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class AptiQuestion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Qid", unique =true, nullable = false)
	private Integer Qid;
	private String Qcontent;
	
	@OneToMany(cascade = CascadeType.ALL  ,fetch = FetchType.EAGER, mappedBy = "Aquestion")
	private List<AptiAnswer> Qanswers = new ArrayList<AptiAnswer>();

	public AptiQuestion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AptiQuestion(Integer qid, String qcontent, List<AptiAnswer> qanswers) {
		super();
		Qid = qid;
		Qcontent = qcontent;
		Qanswers = qanswers;
	}

	public Integer getQid() {
		return Qid;
	}

	public void setQid(Integer qid) {
		Qid = qid;
	}

	public String getQcontent() {
		return Qcontent;
	}

	public void setQcontent(String qcontent) {
		Qcontent = qcontent;
	}

	public List<AptiAnswer> getQanswers() {
		return Qanswers;
	}

	public void setQanswers(List<AptiAnswer> qanswers) {
		Qanswers = qanswers;
	}
	
	
	

}
