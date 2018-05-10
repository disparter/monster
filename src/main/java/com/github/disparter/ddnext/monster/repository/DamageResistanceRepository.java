package com.github.disparter.ddnext.monster.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.disparter.ddnext.monster.entity.DamageResistance;
import com.github.disparter.ddnext.monster.repository.custom.DamageResistanceCustom;

@Repository
public interface DamageResistanceRepository extends CrudRepository<DamageResistance, Long>, DamageResistanceCustom { 

}
