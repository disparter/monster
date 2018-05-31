package com.github.disparter.ddnext.monster.repository.impl;

import java.util.Arrays;
import java.util.List;

import com.github.disparter.ddnext.monster.entity.SpeedType;
import com.github.disparter.ddnext.monster.repository.custom.SpeedCustom;

public class SpeedRepositoryImpl implements SpeedCustom {

	@Override
	public List<SpeedType> getTypes() {
		return Arrays.asList(SpeedType.values());
	}

}
