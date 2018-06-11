package com.github.disparter.ddnext.monster.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.disparter.ddnext.monster.helper.Translator;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Size {
    
    TINY("size.tiny.name","size.tiny.description"),
    SMALL("size.small.name","size.small.description"),
    MEDIUM("size.medium.name","size.medium.description"),
    LARGE("size.large.name","size.large.description"),
    HUGE("size.huge.name","size.huge.description"),
    GARGANTUAN("size.gargantuan.name","size.gargantuan.description");
    
    private String name;
    private String description;
    
    Size(String name, String description){
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
