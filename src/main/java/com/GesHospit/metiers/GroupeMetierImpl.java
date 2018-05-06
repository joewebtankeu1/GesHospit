package com.GesHospit.metiers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GesHospit.dao.GroupeRepository;
import com.GesHospit.entites.Groupe;
@Service
public class GroupeMetierImpl implements IGroupeMetier {
@Autowired
private GroupeRepository groupeRepository;
	@Override
	public Groupe saveGroupe(Groupe gpe) {
		// TODO Auto-generated method stub
		return groupeRepository.save(gpe);
	}

	@Override
	public List<Groupe> listgroupe() {
		// TODO Auto-generated method stub
		return groupeRepository.findAll();
	}

}
