package com.GesHospit.entites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("modif")
public class Modification extends OperationsPatient {

}
