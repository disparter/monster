package com.github.disparter.ddnext.monster.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.github.disparter.ddnext.monster.helper.GlobalConstants;

@Entity
@SequenceGenerator(schema=GlobalConstants.SCHEMA, name = Attribute.SEQUENCE, initialValue=1)
public class Attribute implements Serializable {

	private static final long serialVersionUID = 1723636601126299310L;

	public static final String SEQUENCE = "attribute_seq";
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator=Attribute.SEQUENCE)
	@Column(name="int_attribute_id")
	private Long id;
	
	@Column(name="int_value")
	private Integer value;

	@Column(name="st_saving_throw")
	private Boolean savingThrow;

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

	public Boolean getSavingThrow() {
		return savingThrow;
	}

	public void setSavingThrow(Boolean savingThrow) {
		this.savingThrow = savingThrow;
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
		Attribute other = (Attribute) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
