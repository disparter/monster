package com.github.disparter.ddnext.monster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.disparter.ddnext.monster.entity.SpeedType;
import com.github.disparter.ddnext.monster.service.SpeedService;

@RestController
@RequestMapping("/v1/speeds")
public class SpeedController {

    @Autowired
    private SpeedService speedService;
    
    @RequestMapping(path = "/types", method = RequestMethod.GET)
    public ResponseEntity<List<SpeedType>> types() {
        return ResponseEntity.ok(speedService.getTypes());
    }
    
}
