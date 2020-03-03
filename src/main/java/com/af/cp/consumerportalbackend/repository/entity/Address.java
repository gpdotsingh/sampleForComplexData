package com.af.cp.consumerportalbackend.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "address")
@Entity
public abstract class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Party party;
    @Override
    public String toString() {
        return "Address{" + "id=" + id + '}';
    }
}
