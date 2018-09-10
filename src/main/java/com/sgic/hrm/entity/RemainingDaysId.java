package com.sgic.hrm.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class RemainingDaysId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6408607953852291170L;
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;
	@ManyToOne
	@JoinColumn(name = "typeId")
	private LeaveType type;

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

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof RemainingDaysId))
			return false;
		RemainingDaysId that = (RemainingDaysId) o;
		return Objects.equals(getUser(), that.getUser()) && Objects.equals(getType(), that.getType());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getUser(), getType());
	}
}