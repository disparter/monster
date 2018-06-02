package com.github.disparter.ddnext.monster.repository.impl;

import java.util.Arrays;
import java.util.List;

import com.github.disparter.ddnext.monster.entity.SkillType;
import com.github.disparter.ddnext.monster.repository.custom.SkillCustom;

public class SkillRepositoryImpl implements SkillCustom {

    @Override
    public List<SkillType> getTypes() {
        return Arrays.asList(SkillType.values());
    }

}
