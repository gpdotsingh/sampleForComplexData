package com.af.cp.consumerportalbackend.repository.entity.address;

import com.af.cp.consumerportalbackend.repository.entity.Address;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class EmailAddress extends Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
}
