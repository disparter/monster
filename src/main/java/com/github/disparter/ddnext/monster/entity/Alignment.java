package com.github.disparter.ddnext.monster.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.disparter.ddnext.monster.helper.Translator;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Alignment {
    
    LAWFUL_GOOD("alignment.lg.name","alignment.lg.description"), 
    NEUTRAL_GOOD("alignment.ng.name","alignment.ng.description"), 
    CHAOTIC_GOOD("alignment.cg.name","alignment.cg.description"), 

    LAWFUL_EVIL("alignment.le.name","alignment.le.description"), 
    NEUTRAL_EVIL("alignment.ne.name","alignment.ne.description"), 
    CHAOTIC_EVIL("alignment.ce.name","alignment.ce.description"), 
    
    NEUTRAL("alignment.n.name","alignment.n.description"),
    LAWFUL_NEUTRAL("alignment.ln.name","alignment.ln.description"),
    CHAOTIC_NEUTRAL("alignment.cn.name","alignment.ln.description");

    
    private String name;
    private String description;
    
    Alignment(String name, String description){
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
