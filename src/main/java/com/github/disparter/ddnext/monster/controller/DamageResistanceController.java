package com.github.disparter.ddnext.monster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.disparter.ddnext.monster.entity.DamageResistanceType;
import com.github.disparter.ddnext.monster.service.DamageResistanceService;

@RestController
@RequestMapping("/v1/resistances")
public class DamageResistanceController {

	@Autowired
	private DamageResistanceService damageResistanceService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<DamageResistanceType>> types() {
	    return ResponseEntity.ok(damageResistanceService.getTypes());
	}
    
}
