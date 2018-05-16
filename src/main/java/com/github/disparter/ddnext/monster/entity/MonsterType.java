package com.github.disparter.ddnext.monster.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.disparter.ddnext.monster.helper.Translator;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum MonsterType {
	Aberration("monster.aberration.name","monster.aberration.description"),
	Beast("monster.beast.name","monster.beast.description"),
	Celestial("monster.celestial.name","monster.celestial.description"),
	Construct("monster.construct.name","monster.construct.description"),
	Dragon("monster.dragon.name","monster.dragon.description"),
	Elemental("monster.elemental.name","monster.elemental.description"),
	Fey("monster.fey.name","monster.fey.description"),
	Fiend("monster.fiend.name","monster.fiend.description"),
	Giant("monster.giant.name","monster.giant.description"),
	Humanoid("monster.humanoid.name","monster.humanoid.description"),
	Monstrosity("monster.monstrosity.name","monster.monstrosity.description"),
	Ooze("monster.ooze.name","monster.ooze.description"),
	Plant("monster.plant.name","monster.plant.description"),
	Undead("monster.undead.name","monster.undead.description");
	
	private String name;
	private String description;
	
	MonsterType(String name, String description){
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
