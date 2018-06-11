package com.github.disparter.ddnext.monster.repository.custom;

import java.util.List;

import com.github.disparter.ddnext.monster.entity.Alignment;
import com.github.disparter.ddnext.monster.entity.MonsterType;
import com.github.disparter.ddnext.monster.entity.Size;

public interface MonsterCustom { 
    
    public List<MonsterType> getTypes();
    
    public List<Alignment> getAlignments();

    public List<Size> getSizes();
    
}
