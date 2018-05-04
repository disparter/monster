package com.github.disparter.ddnext.monster.entity;

import java.io.Serializable;

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

import com.github.disparter.ddnext.monster.helper.GlobalConstants;

@Entity
@SequenceGenerator(schema=GlobalConstants.SCHEMA, name = Sense.SEQUENCE, initialValue=1)
public class Sense implements Serializable {

	private static final long serialVersionUID = -5547516882892318292L;

	public static final String SEQUENCE = "sense_seq";
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator=Sense.SEQUENCE)
	@Column(name="int_sense_id")
	private Long id;
	
	@Column(name="int_value")
	private Integer value;
	
	@Enumerated(EnumType.STRING)
	@Column(name="str_type")
	private SenseType type;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="int_monster_id")
	private Monster monster;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public SenseType getType() {
		return type;
	}

	public void setType(SenseType type) {
		this.type = type;
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
		Sense other = (Sense) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
