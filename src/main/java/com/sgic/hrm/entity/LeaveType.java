package com.sgic.hrm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Anushanth
 *
 */
@Entity
public class LeaveType {

	@Id
	private Integer id;
	private String type;
	private Integer allocatedDays;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getAllocatedDays() {
		return allocatedDays;
	}

	public void setAllocatedDays(Integer allocatedDays) {
		this.allocatedDays = allocatedDays;
	}
}
