package com.GesHospit.metiers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GesHospit.dao.PereFilsLocalisationRepository;
import com.GesHospit.entites.PereFilsLocalisation;
@Service
public class PereFilsLocalisationMetierImpl  implements IPereFilsLocalisationMetier{
@Autowired
private PereFilsLocalisationRepository pereFilsLocalisationRepository;
	@Override
	public PereFilsLocalisation savePereFilsLocalisation(PereFilsLocalisation perefils) {
		// TODO Auto-generated method stub
		return pereFilsLocalisationRepository.save(perefils);
	}

	@Override
	public List<PereFilsLocalisation> listPereFilsLocalisation() {
		// TODO Auto-generated method stub
		return pereFilsLocalisationRepository.findAll();
	}

}
