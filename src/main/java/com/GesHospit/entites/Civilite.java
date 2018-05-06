package com.GesHospit.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Civilite implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long CodeCivilite;
	private String LibelleCivilite;
	
	public Civilite(String libelleCivilite) {
		super();
		LibelleCivilite = libelleCivilite;
	}
	public Civilite() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getCodeCivilite() {
		return CodeCivilite;
	}
	public void setCodeCivilite(Long codeCivilite) {
		CodeCivilite = codeCivilite;
	}
	public String getLibelleCivilite() {
		return LibelleCivilite;
	}
	public void setLibelleCivilite(String libelleCivilite) {
		LibelleCivilite = libelleCivilite;
	}
	

}
