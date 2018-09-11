package com.sgic.hrm.service;

import com.sgic.hrm.entity.Role;

public interface RoleService {
	
	Role getRole(Integer id);
	Iterable<Role> viewAllRole();
	boolean addRole(Role role);
	boolean updateRole(Role role);
	boolean dropRole(Integer id);
}
