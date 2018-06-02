package com.github.disparter.ddnext.monster.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.disparter.ddnext.monster.helper.Translator;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum SpeedType {
    
    BURROW("speed.burrow.name","speed.burrow.description"),
    CLIMB("speed.climb.name","speed.climb.description"),
    FLY("speed.fly.name","speed.fly.description"),
    SWIM("speed.swim.name","speed.swim.description"),
    WALKING("speed.walking.name", "speed.walking.description");

    private String name;
    private String description;
    
    SpeedType(String name, String description){
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
