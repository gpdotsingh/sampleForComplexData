package com.af.cp.consumerportalbackend.repository.entity.roles;

import com.af.cp.consumerportalbackend.repository.entity.PartyRole;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity

public abstract class PlatformUser extends PartyRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

}
