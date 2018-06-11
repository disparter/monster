package com.github.disparter.ddnext.monster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.disparter.ddnext.monster.entity.Alignment;
import com.github.disparter.ddnext.monster.entity.MonsterType;
import com.github.disparter.ddnext.monster.entity.Size;
import com.github.disparter.ddnext.monster.service.MonsterService;

@RestController
@RequestMapping("/v1/monsters")
public class MonsterController {

    @Autowired
    private MonsterService monsterService;
    
    @RequestMapping(path = "/types", method = RequestMethod.GET)
    public ResponseEntity<List<MonsterType>> types() {
        return ResponseEntity.ok(monsterService.getTypes());
    }
    
    @RequestMapping(path = "/alignments", method = RequestMethod.GET)
    public ResponseEntity<List<Alignment>> alignments() {
        return ResponseEntity.ok(monsterService.getAlignments());
    }
    
    @RequestMapping(path = "/sizes", method = RequestMethod.GET)
    public ResponseEntity<List<Size>> sizes() {
        return ResponseEntity.ok(monsterService.getSizes());
    }
}
