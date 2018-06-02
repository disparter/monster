package com.github.disparter.ddnext.monster.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.disparter.ddnext.monster.helper.Translator;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum DamageType {
    //Magical
    ACID("damage.acid.name", "damage.acid.description"),
    COLD("damage.cold.name", "damage.cold.description"),
    FIRE("damage.fire.name", "damage.fire.description"),
    FORCE("damage.force.name", "damage.force.description"),
    LIGHTNING("damage.lightning.name", "damage.lightning.description"),
    NECROTIC("damage.necrotic.name", "damage.necrotic.description"),
    POISON("damage.poison.name", "damage.poison.description"),
    PSYCHIC("damage.psychic.name", "damage.psychic.description"),
    RADIANT("damage.radiant.name", "damage.radiant.description"),
    THUNDER("damage.thunder.name", "damage.thunder.description"),
    BLUDGEONING_MAGIC_WEAPON("damage.magic.bludgeoning.name", "damage.magic.bludgeoning.description"),
    PIERCING_MAGIC_WEAPON("damage.magic.piercing.name", "damage.magic.piercing.description"),
    SLASHING_MAGIC_WEAPON("damage.magic.slashing.name", "damage.magic.slashing.description"),
    
    //Natural
    BLUDGEONING("damage.bludgeoning.name", "damage.bludgeoning.description"),
    PIERCING("damage.piercing.name", "damage.piercing.description"),
    SLASHING("damage.slashing.name", "damage.slashing.description");
    
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
