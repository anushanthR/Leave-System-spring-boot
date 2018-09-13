package com.sgic.hrm.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author Anushanth
 *
 */

@Entity
public class RemainingLeave {

	@EmbeddedId
	private RemainingLeaveId id;
	private float remainDays;

	public RemainingLeaveId getId() {
		return id;
	}

	public void setId(RemainingLeaveId id) {
		this.id = id;
	}

	public float getRemainDays() {
		return remainDays;
	}

	public void setRemainDays(float remainDays) {
		this.remainDays = remainDays;
	}

}
