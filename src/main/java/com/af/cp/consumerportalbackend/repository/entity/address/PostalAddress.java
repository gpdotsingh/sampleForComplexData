package com.af.cp.consumerportalbackend.repository.entity.address;

import com.af.cp.consumerportalbackend.repository.entity.Address;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class PostalAddress extends Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private List<String> addressLines;
    private String postCode;
    private String city;
    private String country;

}
