package com.GesHospit.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class GroupePatient implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdGroupePatient;
	private String LibellePatient;
	private Long NbrePAteint;
	private Date DateCreationGroupePatient; 
	@ManyToOne
	@JoinColumn(name="codePatient")
	private Patient patient;  
	@ManyToOne
	@JoinColumn(name="IdGroupe")
	private Groupe groupe;
	public GroupePatient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GroupePatient(Long idGroupePatient, String libellePatient, Long nbrePAteint,
			Date dateCreationGroupePatient) {
		super();
		IdGroupePatient = idGroupePatient;
		LibellePatient = libellePatient;
		NbrePAteint = nbrePAteint;
		DateCreationGroupePatient = dateCreationGroupePatient;
	}
	public Long getIdGroupePatient() {
		return IdGroupePatient;
	}
	public void setIdGroupePatient(Long idGroupePatient) {
		IdGroupePatient = idGroupePatient;
	}
	public String getLibellePatient() {
		return LibellePatient;
	}
	public void setLibellePatient(String libellePatient) {
		LibellePatient = libellePatient;
	}
	public Long getNbrePAteint() {
		return NbrePAteint;
	}
	public void setNbrePAteint(Long nbrePAteint) {
		NbrePAteint = nbrePAteint;
	}
	public Date getDateCreationGroupePatient() {
		return DateCreationGroupePatient;
	}
	public void setDateCreationGroupePatient(Date dateCreationGroupePatient) {
		DateCreationGroupePatient = dateCreationGroupePatient;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Groupe getGroupe() {
		return groupe;
	}
	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	} 

}
