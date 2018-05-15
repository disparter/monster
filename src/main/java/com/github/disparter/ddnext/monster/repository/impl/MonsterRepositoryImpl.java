package com.github.disparter.ddnext.monster.repository.impl;

import java.util.Arrays;
import java.util.List;

import com.github.disparter.ddnext.monster.entity.Race;
import com.github.disparter.ddnext.monster.repository.custom.MonsterCustom;

public class MonsterRepositoryImpl implements MonsterCustom {

	@Override
	public List<Race> getRaces() {
		return Arrays.asList(Race.values());
	}

}
