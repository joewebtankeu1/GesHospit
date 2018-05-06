package com.GesHospit.entites;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class TypePatient implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long CodeTypePatient;
	private String LibellePatient;
	
	public TypePatient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TypePatient(Long codetypePatient) {
		super();
		CodeTypePatient = codetypePatient;
	}
	
	public Long getCodetypePatient() {
		return CodeTypePatient;
	}
	public void setCodetypePatient(Long codetypePatient) {
		CodeTypePatient = codetypePatient;
	}
	public String getLibellePatient() {
		return LibellePatient;
	}
	public void setLibellePatient(String libellePatient) {
		LibellePatient = libellePatient;
	}

}
