package com.github.disparter.ddnext.monster.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.disparter.ddnext.monster.helper.Translator;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum SenseType {
	
	Blindsight("sense.blindsight.name", "sense.blindsight.description"),
	Darkvision("sense.darkvision.name", "sense.darkvision.description"),
	Tremorsense("sense.tremorsense.name", "sense.tremorsense.description"),
	Truesight("sense.truesight.name", "sense.truesight.description");
	
	private String name;
	private String description;
	
	SenseType(String name, String description){
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return Translator.get(this.name);
	}

	public String getDescription() {
		return Translator.get(this.description);
	}
	
}
