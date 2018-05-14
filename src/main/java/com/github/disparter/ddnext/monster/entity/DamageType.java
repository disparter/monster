package com.github.disparter.ddnext.monster.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.disparter.ddnext.monster.helper.Translator;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum DamageType {
	//Magical
	Acid("damage.acid.name", "damage.acid.description"),
	Cold("damage.cold.name", "damage.cold.description"),
	Fire("damage.fire.name", "damage.fire.description"),
	Force("damage.force.name", "damage.force.description"),
	Lightning("damage.lightning.name", "damage.lightning.description"),
	Necrotic("damage.necrotic.name", "damage.necrotic.description"),
	Poison("damage.poison.name", "damage.poison.description"),
	Psychic("damage.psychic.name", "damage.psychic.description"),
	Radiant("damage.radiant.name", "damage.radiant.description"),
	Thunder("damage.thunder.name", "damage.thunder.description"),
	BludgeoningMagicWeapon("damage.magic.bludgeoning.name", "damage.magic.bludgeoning.description"),
	PiercingMagicWeapon("damage.magic.piercing.name", "damage.magic.piercing.description"),
	SlashingMagicWeapon("damage.magic.slashing.name", "damage.magic.slashing.description"),
	
	//Natural
	Bludgeoning("damage.bludgeoning.name", "damage.bludgeoning.description"),
	Piercing("damage.piercing.name", "damage.piercing.description"),
	Slashing("damage.slashing.name", "damage.slashing.description");
	
	private String name;
	private String description;
	
	DamageType(String name, String description) {
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
