package com.github.disparter.ddnext.monster.repository.impl;

import java.util.Arrays;
import java.util.List;

import com.github.disparter.ddnext.monster.entity.SenseType;
import com.github.disparter.ddnext.monster.repository.custom.SenseCustom;

public class SenseRepositoryImpl implements SenseCustom {

    @Override
    public List<SenseType> getTypes() {
        return Arrays.asList(SenseType.values());
    }

}
