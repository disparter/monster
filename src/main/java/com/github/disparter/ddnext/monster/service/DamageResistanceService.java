package com.github.disparter.ddnext.monster.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.disparter.ddnext.monster.entity.DamageResistanceType;
import com.github.disparter.ddnext.monster.repository.DamageResistanceRepository;

@Service
public class DamageResistanceService {
	
	@Autowired
	private DamageResistanceRepository damageResistanceRepository;	
	
	public List<DamageResistanceType> getTypes() {
		return damageResistanceRepository.getTypes();
	}
	
}
