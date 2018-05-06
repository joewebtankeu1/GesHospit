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
public class AssurancePateint implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long  NumAssure;
	private Long NumSecurite;
	private String Numcontrat;
	private Long isAyantDroit;
	private String NomPrenomAssure; 
	private Date Datecreation;  
	@ManyToOne
	@JoinColumn(name="NumCentralPatient")
	private Patient patient;
	@ManyToOne
	@JoinColumn(name="CodeTiers")
	private Tiers tiers;
	public AssurancePateint() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AssurancePateint(Long numAssure, Long numSecurite, String numcontrat, Long isAyantDroit,
			String nomPrenomAssure, Date datecreation) {
		super();
		NumAssure = numAssure;
		NumSecurite = numSecurite;
		Numcontrat = numcontrat;
		this.isAyantDroit = isAyantDroit;
		NomPrenomAssure = nomPrenomAssure;
		Datecreation = datecreation;
	}
	public Long getNumAssure() {
		return NumAssure;
	}
	public void setNumAssure(Long numAssure) {
		NumAssure = numAssure;
	}
	public Long getNumSecurite() {
		return NumSecurite;
	}
	public void setNumSecurite(Long numSecurite) {
		NumSecurite = numSecurite;
	}
	public String getNumcontrat() {
		return Numcontrat;
	}
	public void setNumcontrat(String numcontrat) {
		Numcontrat = numcontrat;
	}
	public Long getIsAyantDroit() {
		return isAyantDroit;
	}
	public void setIsAyantDroit(Long isAyantDroit) {
		this.isAyantDroit = isAyantDroit;
	}
	public String getNomPrenomAssure() {
		return NomPrenomAssure;
	}
	public void setNomPrenomAssure(String nomPrenomAssure) {
		NomPrenomAssure = nomPrenomAssure;
	}
	public Date getDatecreation() {
		return Datecreation;
	}
	public void setDatecreation(Date datecreation) {
		Datecreation = datecreation;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Tiers getTiers() {
		return tiers;
	}
	public void setTiers(Tiers tiers) {
		this.tiers = tiers;
	}

}
