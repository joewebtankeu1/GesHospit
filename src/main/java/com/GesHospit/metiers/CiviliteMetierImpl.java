package com.GesHospit.metiers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GesHospit.dao.CiviliteRepository;
import com.GesHospit.entites.Civilite;
@Service
public class CiviliteMetierImpl implements ICiviliteMetier {
	@Autowired
	private CiviliteRepository civiliteRepository;

	@Override
	public Civilite saveCivilite(Civilite civ) {
		// TODO Auto-generated method stub
		return civiliteRepository.save(civ);
	}

	@Override
	public List<Civilite> listCivilite() {
		// TODO Auto-generated method stub
		return civiliteRepository.findAll();
	}

}
