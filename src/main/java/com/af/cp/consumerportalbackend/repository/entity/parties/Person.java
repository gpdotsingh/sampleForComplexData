package com.af.cp.consumerportalbackend.repository.entity.parties;

import com.af.cp.consumerportalbackend.repository.entity.Party;
import com.af.cp.consumerportalbackend.repository.entity.parties.persondetails.Genders;
import com.af.cp.consumerportalbackend.repository.entity.parties.persondetails.PersonName;
import com.af.cp.consumerportalbackend.repository.entity.parties.persondetails.RegisteredIdentifier;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;



@Data
@Entity
public class Person extends Party {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private PersonName personName;
    private Genders gender;
    private List<RegisteredIdentifier> registeredIdentifierLit;
}
