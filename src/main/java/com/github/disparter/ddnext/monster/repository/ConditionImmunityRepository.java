package com.github.disparter.ddnext.monster.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.disparter.ddnext.monster.entity.ConditionImmunity;
import com.github.disparter.ddnext.monster.repository.custom.ConditionImmunityCustom;

@Repository
public interface ConditionImmunityRepository extends CrudRepository<ConditionImmunity, Long>, ConditionImmunityCustom { 

}
