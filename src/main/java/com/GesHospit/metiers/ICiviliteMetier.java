package com.GesHospit.metiers;

import java.util.List;

import com.GesHospit.entites.Civilite;

public interface ICiviliteMetier {
 public Civilite saveCivilite(Civilite civ);
 public List <Civilite> listCivilite();
}
