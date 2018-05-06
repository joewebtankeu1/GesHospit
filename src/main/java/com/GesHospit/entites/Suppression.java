package com.GesHospit.entites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("suppr")
public class Suppression extends OperationsPatient{

}
