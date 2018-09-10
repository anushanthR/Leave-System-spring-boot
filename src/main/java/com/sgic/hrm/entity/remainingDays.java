package com.sgic.hrm.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Anushanth
 *
 */

@Entity
public class remainingDays implements Serializable {

	@Id
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;
	@Id
	@ManyToOne
	@JoinColumn(name = "typeId")
	private LeaveType type;
	private Double remainDays;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LeaveType getType() {
		return type;
	}

	public void setType(LeaveType type) {
		this.type = type;
	}

	public Double getRemainDays() {
		return remainDays;
	}

	public void setRemainDays(Double remainDays) {
		this.remainDays = remainDays;
	}

}
