package com.github.disparter.ddnext.monster.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.disparter.ddnext.monster.entity.SenseType;
import com.github.disparter.ddnext.monster.repository.SenseRepository;

@Service
public class SenseService {
    
    @Autowired
    private SenseRepository skillRepository;    
    
    public List<SenseType> getTypes() {
        return skillRepository.getTypes();
    }
    
}
