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
public class Utilisateur implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdUtilisateur;
	private String NomUtilisateur;
	private String PrenomUtilisateur;
	private Date DateNaisUtilisateur;
	private String LieuNaisUtilisateur;
	private Long SexeUtilisateur; 
	private String EmprunteDigid;
	private String SigneBiometrie;
	private String Login;
	private String MotDePasse;
	private Date DateCreation;
	@ManyToOne
	@JoinColumn(name="CodeCivilite")
	private Civilite CodeCivilite;
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(String nomUtilisateur, String prenomUtilisateur, Date dateNaisUtilisateur,
			String lieuNaisUtilisateur, Long sexeUtilisateur, String emprunteDigid, String signeBiometrie, String login,
			String motDePasse, Date dateCreation) {
		super();
		NomUtilisateur = nomUtilisateur;
		PrenomUtilisateur = prenomUtilisateur;
		DateNaisUtilisateur = dateNaisUtilisateur;
		LieuNaisUtilisateur = lieuNaisUtilisateur;
		SexeUtilisateur = sexeUtilisateur;
		EmprunteDigid = emprunteDigid;
		SigneBiometrie = signeBiometrie;
		Login = login;
		MotDePasse = motDePasse;
		DateCreation = dateCreation;
	}
	public Long getIdUtilisateur() {
		return IdUtilisateur;
	}
	public void setIdUtilisateur(Long idUtilisateur) {
		IdUtilisateur = idUtilisateur;
	}
	public String getNomUtilisateur() {
		return NomUtilisateur;
	}
	public void setNomUtilisateur(String nomUtilisateur) {
		NomUtilisateur = nomUtilisateur;
	}
	public String getPrenomUtilisateur() {
		return PrenomUtilisateur;
	}
	public void setPrenomUtilisateur(String prenomUtilisateur) {
		PrenomUtilisateur = prenomUtilisateur;
	}
	public Date getDateNaisUtilisateur() {
		return DateNaisUtilisateur;
	}
	public void setDateNaisUtilisateur(Date dateNaisUtilisateur) {
		DateNaisUtilisateur = dateNaisUtilisateur;
	}
	public String getLieuNaisUtilisateur() {
		return LieuNaisUtilisateur;
	}
	public void setLieuNaisUtilisateur(String lieuNaisUtilisateur) {
		LieuNaisUtilisateur = lieuNaisUtilisateur;
	}
	public Long getSexeUtilisateur() {
		return SexeUtilisateur;
	}
	public void setSexeUtilisateur(Long sexeUtilisateur) {
		SexeUtilisateur = sexeUtilisateur;
	}
	public String getEmprunteDigid() {
		return EmprunteDigid;
	}
	public void setEmprunteDigid(String emprunteDigid) {
		EmprunteDigid = emprunteDigid;
	}
	public String getSigneBiometrie() {
		return SigneBiometrie;
	}
	public void setSigneBiometrie(String signeBiometrie) {
		SigneBiometrie = signeBiometrie;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getMotDePasse() {
		return MotDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		MotDePasse = motDePasse;
	}
	public Date getDateCreation() {
		return DateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		DateCreation = dateCreation;
	}
	public Civilite getCodeCivilite() {
		return CodeCivilite;
	}
	public void setCodeCivilite(Civilite codeCivilite) {
		CodeCivilite = codeCivilite;
	}

}
