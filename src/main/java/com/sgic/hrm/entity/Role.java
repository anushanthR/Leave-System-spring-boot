package com.sgic.hrm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {
	
	@Id	
	Integer id;
	String roleName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
