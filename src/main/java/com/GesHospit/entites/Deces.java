package com.GesHospit.entites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Deces")
public class Deces extends OperationsPatient {

}
