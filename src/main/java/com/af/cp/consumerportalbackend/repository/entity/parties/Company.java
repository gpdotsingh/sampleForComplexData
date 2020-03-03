package com.af.cp.consumerportalbackend.repository.entity.parties;

import com.af.cp.consumerportalbackend.repository.entity.Party;
import com.af.cp.consumerportalbackend.repository.entity.roles.PlatformUser;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Company extends Party {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String iataCode;
    private int numberOfEmployeement;
    @OneToOne
    private PlatformUser platformUser;
}
