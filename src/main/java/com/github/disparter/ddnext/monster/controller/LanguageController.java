package com.github.disparter.ddnext.monster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.disparter.ddnext.monster.entity.LanguageType;
import com.github.disparter.ddnext.monster.service.LanguageService;

@RestController
@RequestMapping("/v1/languages")
public class LanguageController {

    @Autowired
    private LanguageService languageService;
    
    @RequestMapping(path = "/types", method = RequestMethod.GET)
    public ResponseEntity<List<LanguageType>> types() {
        return ResponseEntity.ok(languageService.getTypes());
    }
    
}
