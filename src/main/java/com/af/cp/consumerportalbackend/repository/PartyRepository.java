package com.af.cp.consumerportalbackend.repository;

import com.af.cp.consumerportalbackend.repository.entity.Party;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyRepository extends JpaRepository<Party,Integer> {
}
