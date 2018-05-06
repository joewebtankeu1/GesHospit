package com.GesHospit.metiers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GesHospit.dao.ProfessionRepository;
import com.GesHospit.entites.Profession;

@Service
public class ProfessionMetierImpl implements IProfessionMetier{
@Autowired
private ProfessionRepository professionRepository; 
	@Override
	public Profession saveProfession(Profession prof) {
		// TODO Auto-generated method stub
		return professionRepository.save(prof);
	}

	@Override
	public List<Profession> listProfession() {
		// TODO Auto-generated method stub
		return professionRepository.findAll();
	}

}
