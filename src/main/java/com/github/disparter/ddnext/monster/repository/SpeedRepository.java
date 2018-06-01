package com.github.disparter.ddnext.monster.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.disparter.ddnext.monster.entity.Speed;
import com.github.disparter.ddnext.monster.repository.custom.SpeedCustom;

@Repository
public interface SpeedRepository extends CrudRepository<Speed, Long>, SpeedCustom { 

}
