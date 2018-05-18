package com.github.disparter.ddnext.monster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.disparter.ddnext.monster.entity.SenseType;
import com.github.disparter.ddnext.monster.service.SenseService;

@RestController
@RequestMapping("/v1/senses")
public class SenseController {

	@Autowired
	private SenseService skillService;
	
	@RequestMapping(path = "/types", method = RequestMethod.GET)
	public ResponseEntity<List<SenseType>> types() {
	    return ResponseEntity.ok(skillService.getTypes());
	}
    
}
