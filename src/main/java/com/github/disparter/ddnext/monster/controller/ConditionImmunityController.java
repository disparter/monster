package com.github.disparter.ddnext.monster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.disparter.ddnext.monster.entity.ConditionImmunityType;
import com.github.disparter.ddnext.monster.service.ConditionImmunityService;

@RestController
@RequestMapping("/v1/conditions")
public class ConditionImmunityController {

	@Autowired
	private ConditionImmunityService conditionImmunityService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ConditionImmunityType>> types() {
	    return ResponseEntity.ok(conditionImmunityService.getTypes());
	}
    
}
