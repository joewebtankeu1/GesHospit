package com.GesHospit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.GesHospit.entites.Civilite;
import com.GesHospit.metiers.ICiviliteMetier;

@RestController
public class CivilitesServices {
	@Autowired
	private ICiviliteMetier civiliteMeteir;
	@RequestMapping(value="/Civilite", method=RequestMethod.POST)
	public Civilite saveCivilite(@RequestBody Civilite civ) {
		return civiliteMeteir.saveCivilite(civ);
	}
	
	@RequestMapping(value="/Civilite", method=RequestMethod.GET)
	public List<Civilite> listCivilite(){
		return civiliteMeteir.listCivilite();
		
	}

}
