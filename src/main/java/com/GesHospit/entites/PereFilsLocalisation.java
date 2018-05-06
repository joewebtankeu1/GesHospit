package com.GesHospit.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class PereFilsLocalisation implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long  CodePere;
	private String LibellePere;
	private Long CodeFils;
	private String LibelleFils;
	public PereFilsLocalisation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PereFilsLocalisation(Long codePere) {
		super();
		CodePere = codePere;
	}
	
	public PereFilsLocalisation(Long codePere, Long codeFils) {
		super();
		CodePere = codePere;
		CodeFils = codeFils;
	}

	public Long getCodePere() {
		return CodePere;
	}

	public void setCodePere(Long codePere) {
		CodePere = codePere;
	}

	public String getLibellePere() {
		return LibellePere;
	}

	public void setLibellePere(String libellePere) {
		LibellePere = libellePere;
	}

	public Long getCodeFils() {
		return CodeFils;
	}

	public void setCodeFils(Long codeFils) {
		CodeFils = codeFils;
	}

	public String getLibelleFils() {
		return LibelleFils;
	}

	public void setLibelleFils(String libelleFils) {
		LibelleFils = libelleFils;
	}
}
