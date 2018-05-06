package com.GesHospit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GesHospit.entites.Utilisateur;

public interface  UtilisateurRepository extends JpaRepository<Utilisateur,Long> {

}
