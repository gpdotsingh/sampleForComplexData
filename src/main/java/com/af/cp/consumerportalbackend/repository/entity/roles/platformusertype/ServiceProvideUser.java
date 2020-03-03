package com.af.cp.consumerportalbackend.repository.entity.roles.platformusertype;

import com.af.cp.consumerportalbackend.repository.entity.Party;
import com.af.cp.consumerportalbackend.repository.entity.roles.PlatformUser;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;


@Data
@Entity
public class ServiceProvideUser extends PlatformUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private ServiceProvideUserType serviceProvideUserType;
    private List<Party> partyList;
}
