package com.GesHospit.metiers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GesHospit.dao.AssurancePatientRepository;
import com.GesHospit.entites.AssurancePateint;
@Service

public class AssurancePateintMetierImpl implements IAssurancePateintMetier {
	@Autowired
	
	private AssurancePatientRepository  assurancePatientRepository;

	@Override
	public AssurancePateint assurancePateint(AssurancePateint assurpatient) {
		// TODO Auto-generated method stub
		return assurancePatientRepository.save(assurpatient);
	}

	@Override
	public List<AssurancePateint> listAssurancePateint() {
		// TODO Auto-generated method stub
		return assurancePatientRepository.findAll();
	}

}
