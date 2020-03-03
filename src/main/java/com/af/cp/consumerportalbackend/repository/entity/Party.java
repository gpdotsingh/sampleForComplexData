package com.af.cp.consumerportalbackend.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name = "party")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public abstract class Party extends PartyRole{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JsonProperty("addressess")
    @OneToMany(mappedBy = "party", cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<Address> addressess;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "partyrole_id",unique=true)
    private PartyRole partyrole;
}
