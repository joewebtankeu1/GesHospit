package com.GesHospit.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Tiers implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long  CodeTiers;
	private String DesignTiers;
	private String Commentaire; 
	private String CategTiers;
	private String Comptecomptable;
	private String NomContact;
	private String PrenomContact;
	private String EmailContact;
	private Long CodeCivilite;
	private Long IdCoordonnees; 
	private Long IsDesactive;
	private String NIF;
	private Long IsPaieTVA;
	private String LogoTiers;
	private Long IsContractObligatoire;
	
	public Tiers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tiers(Long codeTiers, String designTiers, String categTiers) {
		super();
		CodeTiers = codeTiers;
		DesignTiers = designTiers;
		CategTiers = categTiers;
	}
	public Long getCodeTiers() {
		return CodeTiers;
	}
	public void setCodeTiers(Long codeTiers) {
		CodeTiers = codeTiers;
	}
	public String getDesignTiers() {
		return DesignTiers;
	}
	public void setDesignTiers(String designTiers) {
		DesignTiers = designTiers;
	}
	public String getCommentaire() {
		return Commentaire;
	}
	public void setCommentaire(String commentaire) {
		Commentaire = commentaire;
	}
	public String getCategTiers() {
		return CategTiers;
	}
	public void setCategTiers(String categTiers) {
		CategTiers = categTiers;
	}
	public String getComptecomptable() {
		return Comptecomptable;
	}
	public void setComptecomptable(String comptecomptable) {
		Comptecomptable = comptecomptable;
	}
	public String getNomContact() {
		return NomContact;
	}
	public void setNomContact(String nomContact) {
		NomContact = nomContact;
	}
	public String getPrenomContact() {
		return PrenomContact;
	}
	public void setPrenomContact(String prenomContact) {
		PrenomContact = prenomContact;
	}
	public String getEmailContact() {
		return EmailContact;
	}
	public void setEmailContact(String emailContact) {
		EmailContact = emailContact;
	}
	public Long getCodeCivilite() {
		return CodeCivilite;
	}
	public void setCodeCivilite(Long codeCivilite) {
		CodeCivilite = codeCivilite;
	}
	public Long getIdCoordonnees() {
		return IdCoordonnees;
	}
	public void setIdCoordonnees(Long idCoordonnees) {
		IdCoordonnees = idCoordonnees;
	}
	public Long getIsDesactive() {
		return IsDesactive;
	}
	public void setIsDesactive(Long isDesactive) {
		IsDesactive = isDesactive;
	}
	public String getNIF() {
		return NIF;
	}
	public void setNIF(String nIF) {
		NIF = nIF;
	}
	public Long getIsPaieTVA() {
		return IsPaieTVA;
	}
	public void setIsPaieTVA(Long isPaieTVA) {
		IsPaieTVA = isPaieTVA;
	}
	public String getLogoTiers() {
		return LogoTiers;
	}
	public void setLogoTiers(String logoTiers) {
		LogoTiers = logoTiers;
	}
	public Long getIsContractObligatoire() {
		return IsContractObligatoire;
	}
	public void setIsContractObligatoire(Long isContractObligatoire) {
		IsContractObligatoire = isContractObligatoire;
	}

}
