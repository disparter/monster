package com.github.disparter.ddnext.monster.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.disparter.ddnext.monster.entity.SkillType;
import com.github.disparter.ddnext.monster.repository.SkillRepository;

@Service
public class SkillService {
    
    @Autowired
    private SkillRepository skillRepository;    
    
    public List<SkillType> getTypes() {
        return skillRepository.getTypes();
    }
    
}
