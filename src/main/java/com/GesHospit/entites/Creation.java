package com.GesHospit.entites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("creat")
public class Creation extends OperationsPatient{

}
