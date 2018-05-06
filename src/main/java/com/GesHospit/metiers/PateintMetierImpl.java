package com.GesHospit.metiers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GesHospit.dao.PatientRepository;
import com.GesHospit.entites.Patient;
@Service
public class PateintMetierImpl implements IPatientMetier {
@Autowired
private PatientRepository patientRepository;
	@Override
	public Patient savePatient(Patient pat) {
		// TODO Auto-generated method stub
		return patientRepository.save(pat);
	}

	@Override
	public List<Patient> listPateint() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

}
