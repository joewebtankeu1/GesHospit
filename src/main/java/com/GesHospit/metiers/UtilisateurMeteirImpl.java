package com.GesHospit.metiers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GesHospit.dao.UtilisateurRepository;
import com.GesHospit.entites.Utilisateur;
@Service
public class UtilisateurMeteirImpl implements IUtilisateurMetier {
@Autowired
private UtilisateurRepository utilisateurRepository;
	@Override
	public Utilisateur saveUtilisateur(Utilisateur util) {
		// TODO Auto-generated method stub
		return utilisateurRepository.save(util);
	}

	@Override
	public List<Utilisateur> listUtilisateur() {
		// TODO Auto-generated method stub
		return utilisateurRepository.findAll();
	}

}
