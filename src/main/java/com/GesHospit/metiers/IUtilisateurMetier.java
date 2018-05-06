package com.GesHospit.metiers;

import java.util.List;

import com.GesHospit.entites.Utilisateur;

public interface IUtilisateurMetier {
	 public Utilisateur saveUtilisateur(Utilisateur util);
	 public List <Utilisateur> listUtilisateur();
}
