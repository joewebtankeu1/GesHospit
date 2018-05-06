package com.GesHospit.metiers;

import java.util.List;

import com.GesHospit.entites.Groupe;

public interface IGroupeMetier {
	public Groupe saveGroupe(Groupe gpe);
	public List<Groupe> listgroupe();

}
