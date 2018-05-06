package com.GesHospit.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Profession implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long CodeProfession;
	private String LibelleProfession;
	
	public Profession() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profession(Long codeProfession) {
		super();
		CodeProfession = codeProfession;
	}
	public Long getCodeProfession() {
		return CodeProfession;
	}
	public void setCodeProfession(Long codeProfession) {
		CodeProfession = codeProfession;
	}
	public String getLibelleProfession() {
		return LibelleProfession;
	}
	public void setLibelleProfession(String libelleProfession) {
		LibelleProfession = libelleProfession;
	}

}
