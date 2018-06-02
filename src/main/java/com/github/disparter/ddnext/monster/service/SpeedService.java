package com.github.disparter.ddnext.monster.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.disparter.ddnext.monster.entity.SpeedType;
import com.github.disparter.ddnext.monster.repository.SpeedRepository;

@Service
public class SpeedService {
    
    @Autowired
    private SpeedRepository speedRepository;    
    
    public List<SpeedType> getTypes() {
        return speedRepository.getTypes();
    }
    
}
