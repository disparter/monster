package com.github.disparter.ddnext.monster.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.disparter.ddnext.monster.helper.Translator;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum LanguageType {
    ALL("language.all.name", "language.all.description"),
    
    //standard
    COMMON("language.common.name", "language.common.description"),
    DWARVISH("language.dwarvish.name", "language.dwarvish.description"),
    ELVISH("language.elvish.name", "language.elvish.description"),
    GIANT("language.giant.name", "language.giant.description"),
    GNOMISH("language.gnomish.name", "language.gnomish.description"),
    GOBLIN("language.goblin.name", "language.goblin.description"),
    HALFLING("language.halfling.name", "language.halfling.description"),
    ORC("language.orc.name", "language.orc.description"),
    
    //exotic
    ABYSSAL("language.abyssal.name", "language.abyssal.description"),
    CELESTIAL("language.celestial.name", "language.celestial.description"),
    DRACONIC("language.draconic.name", "language.draconic.description"),
    DEEPSPEECH("language.deepspeech.name", "language.deepspeech.description"),
    INFERNAL("language.infernal.name", "language.infernal.description"),
    PRIMORDIAL("language.primordial.name", "language.primordial.description"),
    SYLVAN("language.sylvan.name", "language.sylvan.description"),
    UNDERCOMMON("language.undercommon.name", "language.undercommon.description");
    
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
