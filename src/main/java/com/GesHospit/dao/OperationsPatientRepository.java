package com.GesHospit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GesHospit.entites.OperationsPatient;

public interface OperationsPatientRepository extends JpaRepository<OperationsPatient, Long> {

}
