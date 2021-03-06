package com.af.cp.consumerportalbackend.repository.entity.roles;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Entity
public abstract class PlatformOrchestrator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}
