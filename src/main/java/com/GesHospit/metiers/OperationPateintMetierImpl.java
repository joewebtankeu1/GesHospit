package com.GesHospit.metiers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GesHospit.dao.OperationsPatientRepository;
import com.GesHospit.entites.OperationsPatient;
@Service
public class OperationPateintMetierImpl implements IOperationsPateintMetier {
@Autowired
private OperationsPatientRepository operationsPatientRepository;
	@Override
	public OperationsPatient saveOperationsPatient(OperationsPatient opePat) {
		// TODO Auto-generated method stub
		return operationsPatientRepository.save(opePat);
	}

	@Override
	public List<OperationsPatient> listOperationsPatient() {
		// TODO Auto-generated method stub
		return operationsPatientRepository.findAll();
	}

}
