package com.github.disparter.ddnext.monster.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.disparter.ddnext.monster.helper.Translator;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum SkillType {
	
	//strength Based
	Athletics("skill.athletics.name","skill.athletics.description"),
	
	//dexterity based
	Acrobatics("skill.acrobatics.name","skill.acrobatics.description"),
	SleightOfHand("skill.sleightofhand.name","skill.sleightofhand.description"),
	Stealth("skill.stealth.name","skill.stealth.description"),
	
	//intelligence based
	Arcana("skill.arcana.name","skill.arcana.description"),
	History("skill.history.name","skill.history.description"),
	Investigation("skill.investigation.name","skill.investigation.description"),
	Nature("skill.nature.name","skill.nature.description"),
	Religion("skill.religion.name","skill.religion.description"),
	
	//wisdom based
	AnimalHandling("skill.animalhandling.name","skill.animalhandling.description"),
	Insight("skill.insight.name","skill.insight.description"),
	Medicine("skill.medicine.name","skill.medicine.description"),
	Perception("skill.perception.name","skill.perception.description"),
	Survival("skill.survival.name","skill.survival.description"),
	
	//charisma based
	Deception("skill.deception.name","skill.deception.description"),
	Intimidation("skill.intimidation.name","skill.intimidation.description"),
	Performance("skill.performance.name","skill.performance.description"),
	Persuasion("skill.persuasion.name","skill.persuasion.description");

	private String name;
	private String description;
	
	SkillType(String name, String description){
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
