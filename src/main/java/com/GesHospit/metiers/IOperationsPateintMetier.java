package com.GesHospit.metiers;

import java.util.List;

import com.GesHospit.entites.OperationsPatient;

public interface IOperationsPateintMetier {
	public OperationsPatient saveOperationsPatient(OperationsPatient opePat);
	public List<OperationsPatient> listOperationsPatient();

}
