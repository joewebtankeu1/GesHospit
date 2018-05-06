package com.GesHospit.metiers;

import java.util.List;

import com.GesHospit.entites.Patient;

public interface IPatientMetier {
	 public Patient savePatient(Patient pat);
	 public List <Patient> listPateint();

}
