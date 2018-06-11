package com.github.disparter.ddnext.monster.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.disparter.ddnext.monster.entity.Alignment;
import com.github.disparter.ddnext.monster.entity.MonsterType;
import com.github.disparter.ddnext.monster.entity.Size;
import com.github.disparter.ddnext.monster.repository.MonsterRepository;

@Service
public class MonsterService {

    @Autowired
    private MonsterRepository monsterRepository;

    public List<MonsterType> getTypes() {
        return monsterRepository.getTypes();
    }

    public List<Alignment> getAlignments() {
        return monsterRepository.getAlignments();
    }

    public List<Size> getSizes() {
        return monsterRepository.getSizes();
    }

}
