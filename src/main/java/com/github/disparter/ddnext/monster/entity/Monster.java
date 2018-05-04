package com.github.disparter.ddnext.monster.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

import com.github.disparter.ddnext.monster.helper.GlobalConstants;

@Entity
@SequenceGenerator(schema=GlobalConstants.SCHEMA, name = Monster.SEQUENCE, initialValue=1)
public class Monster implements Serializable {

	private static final long serialVersionUID = -6723573931090454036L;

	public static final String SEQUENCE = "monster_seq";
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator=Monster.SEQUENCE)
	@Column(name="int_monster_id")
	private Long id;
	
	@Column(name="str_name")
	private String name;
	
	@Enumerated(EnumType.STRING)
	@Column(name="str_size_id")
	private Size size;
	
	@Enumerated(EnumType.STRING)
	@Column(name="str_race_id")
	private Race race;
	
	@Enumerated(EnumType.STRING)
	@Column(name="str_tendency_ge_id")
	private Tendency tendencyGE;

	@Enumerated(EnumType.STRING)
	@Column(name="str_tendency_lc_id")
	private Tendency tendencyLC;
	
	@Column(name="int_armor_class")
	private Integer armorClass;

	@Column(name="int_hit_points")
	private Integer hitPoints;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="int_strength_id")
	private Attribute strength;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="int_dexterity_id")
	private Attribute dexterity;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="int_constitution_id")
	private Attribute constitution;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="int_inteligence_id")
	private Attribute inteligence;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="int_wisdom_id")
	private Attribute wisdom;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="int_charisma_id")
	private Attribute charisma;
	
	@Column(name="int_proficience_bonus")
	private Integer proficienceBonus;
	
	@Column(name="int_challenge")
	private Integer challenge;
	
	@Transient
	private List<Speed> speeds;
	
	@Transient
	private List<Skill> skills;
	
	@Transient
	private List<DamageResistance> damageResistances;
	
	@Transient
	private List<ConditionImmunity> conditionImmunities;
	
	@Transient
	private List<Sense> senses;
	
	@Transient
	private List<Language> languages;
	
	@Transient
	private List<Ability> abilities;

	@Transient
	private List<Action> actions;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public Tendency getTendencyGE() {
		return tendencyGE;
	}

	public void setTendencyGE(Tendency tendencyGE) {
		this.tendencyGE = tendencyGE;
	}

	public Tendency getTendencyLC() {
		return tendencyLC;
	}

	public void setTendencyLC(Tendency tendencyLC) {
		this.tendencyLC = tendencyLC;
	}

	public Integer getArmorClass() {
		return armorClass;
	}

	public void setArmorClass(Integer armorClass) {
		this.armorClass = armorClass;
	}

	public Integer getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(Integer hitPoints) {
		this.hitPoints = hitPoints;
	}

	public Attribute getStrength() {
		return strength;
	}

	public void setStrength(Attribute strength) {
		this.strength = strength;
	}

	public Attribute getDexterity() {
		return dexterity;
	}

	public void setDexterity(Attribute dexterity) {
		this.dexterity = dexterity;
	}

	public Attribute getConstitution() {
		return constitution;
	}

	public void setConstitution(Attribute constitution) {
		this.constitution = constitution;
	}

	public Attribute getInteligence() {
		return inteligence;
	}

	public void setInteligence(Attribute inteligence) {
		this.inteligence = inteligence;
	}

	public Attribute getWisdom() {
		return wisdom;
	}

	public void setWisdom(Attribute wisdom) {
		this.wisdom = wisdom;
	}

	public Attribute getCharisma() {
		return charisma;
	}

	public void setCharisma(Attribute charisma) {
		this.charisma = charisma;
	}

	public Integer getProficienceBonus() {
		return proficienceBonus;
	}

	public void setProficienceBonus(Integer proficienceBonus) {
		this.proficienceBonus = proficienceBonus;
	}

	public Integer getChallenge() {
		return challenge;
	}

	public void setChallenge(Integer challenge) {
		this.challenge = challenge;
	}

	public List<Speed> getSpeeds() {
		return speeds;
	}

	public void setSpeeds(List<Speed> speeds) {
		this.speeds = speeds;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public List<DamageResistance> getDamageResistances() {
		return damageResistances;
	}

	public void setDamageResistances(List<DamageResistance> damageResistances) {
		this.damageResistances = damageResistances;
	}

	public List<ConditionImmunity> getConditionImmunities() {
		return conditionImmunities;
	}

	public void setConditionImmunities(List<ConditionImmunity> conditionImmunities) {
		this.conditionImmunities = conditionImmunities;
	}

	public List<Sense> getSenses() {
		return senses;
	}

	public void setSenses(List<Sense> senses) {
		this.senses = senses;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	public List<Ability> getAbilities() {
		return abilities;
	}

	public void setAbilities(List<Ability> abilities) {
		this.abilities = abilities;
	}

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Monster other = (Monster) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
