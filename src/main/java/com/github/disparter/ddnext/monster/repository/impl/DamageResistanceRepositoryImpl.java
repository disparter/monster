package com.github.disparter.ddnext.monster.repository.impl;

import java.util.Arrays;
import java.util.List;

import com.github.disparter.ddnext.monster.entity.DamageType;
import com.github.disparter.ddnext.monster.repository.custom.DamageResistanceCustom;

public class DamageResistanceRepositoryImpl implements DamageResistanceCustom {

    @Override
    public List<DamageType> getTypes() {
        return Arrays.asList(DamageType.values());
    }

}
