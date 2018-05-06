package com.GesHospit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.GesHospit.entites.TypePatient;
import com.GesHospit.metiers.ITypePatientMetier;
@RestController
public class TypePatientServices {
	@Autowired
	private ITypePatientMetier typePatientMetier;
	@RequestMapping(value="/TypePatient", method=RequestMethod.POST)
	public TypePatient saveTypePatient(@RequestBody TypePatient typPat) {
		return typePatientMetier.saveTypePatient(typPat);
	}
	
	@RequestMapping(value="/TypePatient", method=RequestMethod.GET)
	public List<TypePatient> listTypePatient(){
		return typePatientMetier.listTypePatient();
		
	}


}
