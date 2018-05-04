package com.github.disparter.ddnext.monster.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.github.disparter.ddnext.monster.helper.GlobalConstants;

@Entity
@SequenceGenerator(schema=GlobalConstants.SCHEMA, name = Action.SEQUENCE, initialValue=1)
public class Action implements Serializable {

	private static final long serialVersionUID = 2661998350005783780L;

	public static final String SEQUENCE = "action_seq";
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator=Action.SEQUENCE)
	@Column(name="int_language_id")
	private Long id;
	
	@Column(name="str_type", length=2000)
	private String description;
	
	@Column(name="int_average_damage")
	private Integer averageDamage;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="int_monster_id")
	private Monster monster;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAverageDamage() {
		return averageDamage;
	}

	public void setAverageDamage(Integer averageDamage) {
		this.averageDamage = averageDamage;
	}

	public Monster getMonster() {
		return monster;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
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
		Action other = (Action) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
