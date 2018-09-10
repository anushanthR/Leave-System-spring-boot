package com.sgic.hrm.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author Anushanth
 *
 */

@Entity
public class remainingDays {

	@EmbeddedId
	private RemainingDaysId id;
	private Double remainDays;

	public RemainingDaysId getId() {
		return id;
	}

	public void setId(RemainingDaysId id) {
		this.id = id;
	}

	public Double getRemainDays() {
		return remainDays;
	}

	public void setRemainDays(Double remainDays) {
		this.remainDays = remainDays;
	}

}
