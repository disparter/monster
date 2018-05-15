package com.github.disparter.ddnext.monster.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.disparter.ddnext.monster.entity.Monster;
import com.github.disparter.ddnext.monster.repository.custom.MonsterCustom;

@Repository
public interface MonsterRepository extends CrudRepository<Monster, Long>, MonsterCustom { 

}
