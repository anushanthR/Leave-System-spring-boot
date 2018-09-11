package com.sgic.hrm.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Embeddable
public class RemainingDaysId implements Serializable {

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

	
//	@Override
//	public boolean equals(Object o) {
//		if (this == o)
//			return true;
//		if (!(o instanceof RemainingDaysId))
//			return false;
//		RemainingDaysId that = (RemainingDaysId) o;
//		return Objects.equals(getUser(), that.getUser()) && Objects.equals(getType(), that.getType());
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(getUser(), getType());
//	}

}
