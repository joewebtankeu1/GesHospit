package com.GesHospit.metiers;

import java.util.List;

import com.GesHospit.entites.PereFilsLocalisation;

public interface IPereFilsLocalisationMetier {
	public PereFilsLocalisation savePereFilsLocalisation(PereFilsLocalisation perefils);
	public List<PereFilsLocalisation> listPereFilsLocalisation();

}
