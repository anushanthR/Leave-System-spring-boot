package com.sgic.hrm.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author Anushanth
 *
 */

@Entity
public class RemainingDays {

	@EmbeddedId
	private RemainingDaysId id;
	private float remainDays;

	public RemainingDaysId getId() {
		return id;
	}

	public void setId(RemainingDaysId id) {
		this.id = id;
	}

	public float getRemainDays() {
		return remainDays;
	}

	public void setRemainDays(float remainDays) {
		this.remainDays = remainDays;
	}

}
