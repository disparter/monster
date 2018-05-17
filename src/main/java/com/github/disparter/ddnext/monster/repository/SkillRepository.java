package com.github.disparter.ddnext.monster.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.disparter.ddnext.monster.entity.Skill;
import com.github.disparter.ddnext.monster.repository.custom.SkillCustom;

@Repository
public interface SkillRepository extends CrudRepository<Skill, Long>, SkillCustom { 

}
