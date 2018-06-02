package com.github.disparter.ddnext.monster.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.disparter.ddnext.monster.entity.LanguageType;
import com.github.disparter.ddnext.monster.repository.LanguageRepository;

@Service
public class LanguageService {
    
    @Autowired
    private LanguageRepository languageRepository;    
    
    public List<LanguageType> getTypes() {
        return languageRepository.getTypes();
    }
    
}
