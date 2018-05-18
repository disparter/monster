package com.github.disparter.ddnext.monster.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.disparter.ddnext.monster.entity.Sense;
import com.github.disparter.ddnext.monster.repository.custom.SenseCustom;

@Repository
public interface SenseRepository extends CrudRepository<Sense, Long>, SenseCustom { 

}
