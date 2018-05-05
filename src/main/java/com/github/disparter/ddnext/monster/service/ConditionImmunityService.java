package com.github.disparter.ddnext.monster.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.disparter.ddnext.monster.entity.ConditionImmunityType;
import com.github.disparter.ddnext.monster.repository.ConditionImmunityRepository;

@Service
public class ConditionImmunityService {
	
	@Autowired
	private ConditionImmunityRepository conditionImmunityRepository;	
	
	public List<ConditionImmunityType> getTypes() {
		return conditionImmunityRepository.getTypes();
	}
	
}
