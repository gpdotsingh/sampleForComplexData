package com.af.cp.consumerportalbackend.repository.entity.address;

import com.af.cp.consumerportalbackend.repository.entity.Address;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Entity
public class TelecomAddress extends Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String countryCode;
    private String areaCode;
    private String number;
}
