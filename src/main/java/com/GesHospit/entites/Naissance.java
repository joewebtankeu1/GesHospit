package com.GesHospit.entites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("naiss")
public class Naissance extends OperationsPatient {

}
