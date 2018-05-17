package com.github.disparter.ddnext.monster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.disparter.ddnext.monster.entity.SkillType;
import com.github.disparter.ddnext.monster.service.SkillService;

@RestController
@RequestMapping("/v1/skills")
public class SkillController {

	@Autowired
	private SkillService skillService;
	
	@RequestMapping(path = "/types", method = RequestMethod.GET)
	public ResponseEntity<List<SkillType>> types() {
	    return ResponseEntity.ok(skillService.getTypes());
	}
    
}
