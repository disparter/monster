package com.github.disparter.ddnext.monster.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.disparter.ddnext.monster.helper.Translator;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum SkillType {
    
    //strength Based
    ATHLETICS("skill.athletics.name","skill.athletics.description"),
    
    //dexterity based
    ACROBATICS("skill.acrobatics.name","skill.acrobatics.description"),
    SLEIGHTOFHAND("skill.sleightofhand.name","skill.sleightofhand.description"),
    STEALTH("skill.stealth.name","skill.stealth.description"),
    
    //intelligence based
    ARCANA("skill.arcana.name","skill.arcana.description"),
    HISTORY("skill.history.name","skill.history.description"),
    INVESTIGATION("skill.investigation.name","skill.investigation.description"),
    NATURE("skill.nature.name","skill.nature.description"),
    RELIGION("skill.religion.name","skill.religion.description"),
    
    //wisdom based
    ANIMAL_HANDLING("skill.animalhandling.name","skill.animalhandling.description"),
    INSIGHT("skill.insight.name","skill.insight.description"),
    MEDICINE("skill.medicine.name","skill.medicine.description"),
    PERCEPTION("skill.perception.name","skill.perception.description"),
    SURVIVAL("skill.survival.name","skill.survival.description"),
    
    //charisma based
    DECEPTION("skill.deception.name","skill.deception.description"),
    INTIMIDATION("skill.intimidation.name","skill.intimidation.description"),
    PERFORMANCE("skill.performance.name","skill.performance.description"),
    PERSUASION("skill.persuasion.name","skill.persuasion.description");

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
