package com.GesHospit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GesHospit.entites.AssurancePateint;



public interface AssurancePatientRepository extends JpaRepository<AssurancePateint, Long> {

}
