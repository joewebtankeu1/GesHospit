package com.GesHospit.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(length=5)
public abstract class OperationsPatient implements Serializable  {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdOperationPatient;
	private Date DateOperationPatient;
	@ManyToOne
	@JoinColumn(name="IdUtilisateur")
	private Utilisateur utilisateur;
	@ManyToOne
	@JoinColumn(name="NumCentralPatient")
	private Patient patient;
	public OperationsPatient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OperationsPatient(Long idOperationPatient, Date dateOperationPatient) {
		super();
		IdOperationPatient = idOperationPatient;
		DateOperationPatient = dateOperationPatient;
	}
	public Long getIdOperationPatient() {
		return IdOperationPatient;
	}
	public void setIdOperationPatient(Long idOperationPatient) {
		IdOperationPatient = idOperationPatient;
	}
	public Date getDateOperationPatient() {
		return DateOperationPatient;
	}
	public void setDateOperationPatient(Date dateOperationPatient) {
		DateOperationPatient = dateOperationPatient;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	} 
}
