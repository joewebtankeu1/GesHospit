package com.GesHospit.metiers;

import java.util.List;

import com.GesHospit.entites.TypePatient;

public interface ITypePatientMetier {
	
	public TypePatient saveTypePatient(TypePatient typPat);
	public List<TypePatient>listTypePatient();

}
