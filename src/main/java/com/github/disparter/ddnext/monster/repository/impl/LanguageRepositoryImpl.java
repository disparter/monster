package com.github.disparter.ddnext.monster.repository.impl;

import java.util.Arrays;
import java.util.List;

import com.github.disparter.ddnext.monster.entity.LanguageType;
import com.github.disparter.ddnext.monster.repository.custom.LanguageCustom;

public class LanguageRepositoryImpl implements LanguageCustom {

	@Override
	public List<LanguageType> getTypes() {
		return Arrays.asList(LanguageType.values());
	}

}
