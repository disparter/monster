package com.github.disparter.ddnext.monster.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.disparter.ddnext.monster.helper.Translator;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum LanguageType {
	All("language.all.name", "language.all.description"),
	
	//standard
	Common("language.common.name", "language.common.description"),
	Dwarvish("language.dwarvish.name", "language.dwarvish.description"),
	Elvish("language.elvish.name", "language.elvish.description"),
	Giant("language.giant.name", "language.giant.description"),
	Gnomish("language.gnomish.name", "language.gnomish.description"),
	Goblin("language.goblin.name", "language.goblin.description"),
	Halfling("language.halfling.name", "language.halfling.description"),
	Orc("language.orc.name", "language.orc.description"),
	
	//exotic
	Abyssal("language.abyssal.name", "language.abyssal.description"),
	Celestial("language.celestial.name", "language.celestial.description"),
	Draconic("language.draconic.name", "language.draconic.description"),
	Deepspeech("language.deepspeech.name", "language.deepspeech.description"),
	Infernal("language.infernal.name", "language.infernal.description"),
	Primordial("language.primordial.name", "language.primordial.description"),
	Sylvan("language.sylvan.name", "language.sylvan.description"),
	Undercommon("language.undercommon.name", "language.undercommon.description");
	
	private String name;
	private String description;
	
	LanguageType(String name, String description){
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
