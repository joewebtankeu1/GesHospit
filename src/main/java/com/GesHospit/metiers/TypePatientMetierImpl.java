package com.GesHospit.metiers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GesHospit.dao.TypePatientRepository;
import com.GesHospit.entites.TypePatient;
@Service
public class TypePatientMetierImpl implements ITypePatientMetier {
@Autowired
private TypePatientRepository typePatientRepository;
	@Override
	public TypePatient saveTypePatient(TypePatient typPat) {
		// TODO Auto-generated method stub
		return typePatientRepository.save(typPat);
	}

	@Override
	public List<TypePatient> listTypePatient() {
		// TODO Auto-generated method stub
		return typePatientRepository.findAll();
	}

}
