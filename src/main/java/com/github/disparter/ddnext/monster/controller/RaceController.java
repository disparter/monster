package com.github.disparter.ddnext.monster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.disparter.ddnext.monster.entity.Race;
import com.github.disparter.ddnext.monster.service.RaceService;

@RestController
@RequestMapping("/v1/races")
public class RaceController {

	@Autowired
	private RaceService raceService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Race>> types() {
	    return ResponseEntity.ok(raceService.getRaces());
	}
    
}
