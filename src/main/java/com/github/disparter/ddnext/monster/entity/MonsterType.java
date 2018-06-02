package com.github.disparter.ddnext.monster.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.disparter.ddnext.monster.helper.Translator;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum MonsterType {
    ABERRATION("monster.aberration.name","monster.aberration.description"),
    BEAST("monster.beast.name","monster.beast.description"),
    CELESTIAL("monster.celestial.name","monster.celestial.description"),
    CONSTRUCT("monster.construct.name","monster.construct.description"),
    DRAGON("monster.dragon.name","monster.dragon.description"),
    ELEMENTAL("monster.elemental.name","monster.elemental.description"),
    FEY("monster.fey.name","monster.fey.description"),
    FIEND("monster.fiend.name","monster.fiend.description"),
    GIANT("monster.giant.name","monster.giant.description"),
    HUMANOID("monster.humanoid.name","monster.humanoid.description"),
    MONSTROSITY("monster.monstrosity.name","monster.monstrosity.description"),
    OOZE("monster.ooze.name","monster.ooze.description"),
    PLANT("monster.plant.name","monster.plant.description"),
    UNDEAD("monster.undead.name","monster.undead.description");
    
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
