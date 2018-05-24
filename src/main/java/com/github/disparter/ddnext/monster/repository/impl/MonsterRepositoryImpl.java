package com.github.disparter.ddnext.monster.repository.impl;

import java.util.Arrays;
import java.util.List;

import com.github.disparter.ddnext.monster.entity.Alignment;
import com.github.disparter.ddnext.monster.entity.MonsterType;
import com.github.disparter.ddnext.monster.repository.custom.MonsterCustom;

public class MonsterRepositoryImpl implements MonsterCustom {

	@Override
	public List<MonsterType> getTypes() {
		return Arrays.asList(MonsterType.values());
	}

	@Override
	public List<Alignment> getAlignments() {
		return Arrays.asList(Alignment.values());
	}

}
