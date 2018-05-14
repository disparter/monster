package com.github.disparter.ddnext.monster.repository.impl;

import java.util.Arrays;
import java.util.List;

import com.github.disparter.ddnext.monster.entity.ConditionType;
import com.github.disparter.ddnext.monster.repository.custom.ConditionImmunityCustom;

public class ConditionImmunityRepositoryImpl implements ConditionImmunityCustom {

	@Override
	public List<ConditionType> getTypes() {
		return Arrays.asList(ConditionType.values());
	}

}
