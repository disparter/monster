package com.github.disparter.ddnext.monster.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.disparter.ddnext.monster.entity.Race;
import com.github.disparter.ddnext.monster.repository.MonsterRepository;

@Service
public class RaceService {
	
	@Autowired
	private MonsterRepository monsterRepository;	
	
	public List<Race> getRaces() {
		return monsterRepository.getRaces();
	}
	
}
