/**
 * 
 */
package com.sgic.hrm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Anushanth
 *
 */
@Entity
public class LeaveStatus {

	@Id
	private Integer id;
	private String status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
