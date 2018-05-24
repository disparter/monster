package com.github.disparter.ddnext.monster.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.disparter.ddnext.monster.helper.Translator;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Alignment {
	
	LawfulGood("alignment.lg.name","alignment.lg.description"), 
	NeutralGood("alignment.ng.name","alignment.ng.description"), 
	ChaoticGood("alignment.cg.name","alignment.cg.description"), 

	LawfulEvil("alignment.le.name","alignment.le.description"), 
	NeutralEvil("alignment.ne.name","alignment.ne.description"), 
	ChaoticEvil("alignment.ce.name","alignment.ce.description"), 
	
	Neutral("alignment.n.name","alignment.n.description"),
	LawfulNeutral("alignment.ln.name","alignment.ln.description"),
	ChaoticNeutral("alignment.cn.name","alignment.ln.description");

	
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
