package com.GesHospit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GesHospit.entites.Patient;

public interface PatientRepository extends JpaRepository<Patient, String> {

}
