package com.github.disparter.ddnext.monster.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.disparter.ddnext.monster.helper.Translator;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Race {
	Aberration("race.aberration.name","race.aberration.description"),
	Beast("race.beast.name","race.beast.description"),
	Celestial("race.celestial.name","race.celestial.description"),
	Construct("race.construct.name","race.construct.description"),
	Dragon("race.dragon.name","race.dragon.description"),
	Elemental("race.elemental.name","race.elemental.description"),
	Fiend("race.fiend.name","race.fiend.description"),
	Giant("race.giant.name","race.giant.description"),
	Humanoid("race.humanoid.name","race.humanoid.description"),
	Monstrosity("race.monstrosity.name","race.monstrosity.description"),
	Ooze("race.ooze.name","race.ooze.description"),
	Plant("race.plant.name","race.plant.description"),
	Undead("race.undead.name","race.undead.description");
	
	private String name;
	private String description;
	
	Race(String name, String description){
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
