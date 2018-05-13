package com.github.disparter.ddnext.monster.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.disparter.ddnext.monster.helper.MessageSourceHelper;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ConditionImmunityType {
	
	//Common
	BLINDED("blinded.condition.name", "blinded.condition.description"),
	CHARMED("charmed.condition.name", "charmed.condition.description"),
	DEAFENED("deafened.condition.name", "deafened.condition.description"),
	FATIGUED("fatigued.condition.name", "fatigued.condition.description"),
	FRIGHTNED("frightned.condition.name", "frightned.condition.description"),
	GRAPPLED("grappled.condition.name", "grappled.condition.description"),
	PARALYZED("paralyzed.condition.name", "paralyzed.condition.description"),
	PETRIFIED("petrified.condition.name", "petrified.condition.description"),
	POISONED("poisoned.condition.name", "poisoned.condition.description"),
	PRONE("prone.condition.name", "prone.condition.description"),
	RESTRAINED("restrained.condition.name", "restrained.condition.description"),
	STUNNED("stunned.condition.name", "stunned.condition.description"),
	UNCONSCIOUS("unconscious.condition.name", "unconscious.condition.description"),
	
	//Uncommon
	EXHAUSTION("exhaustion.condition.name", "exhaustion.condition.description"),
	SURPRISED("surprised.condition.name", "surprised.condition.description"),
	INVISIBLE("invisible.condition.name", "invisible.condition.description"),
	INCAPACITATED("incapacitated.condition.name", "incapacitated.condition.description");
	
	private String name;
	private String description;
	
	ConditionImmunityType(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return MessageSourceHelper.get(this.name);
	}

	public String getDescription() {
		return MessageSourceHelper.get(this.description);
	}
	
}
