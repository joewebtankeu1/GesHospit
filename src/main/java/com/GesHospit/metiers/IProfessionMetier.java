package com.GesHospit.metiers;

import java.util.List;

import com.GesHospit.entites.Profession;

public interface IProfessionMetier {
	public Profession saveProfession(Profession prof);
	public List<Profession>listProfession();

}
