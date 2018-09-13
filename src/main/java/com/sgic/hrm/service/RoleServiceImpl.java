package com.sgic.hrm.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entity.Role;
import com.sgic.hrm.entity.RoleRepository;


/**
 * @author Anushanth
 *
 */
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository roleRepo;

	@Override
	public Iterable<Role> viewAllRole() {
		return roleRepo.findAll();
	}

	@Override
	public boolean addRole(Role role) {
		roleRepo.save(role);
		return true;
	}

	@Override
	public boolean updateRole(Role role) {
		boolean success = false;
		Role rolefromDB = getRole(role.getId());
		if (null != rolefromDB) {
			rolefromDB.setRoleName(role.getRoleName());
			roleRepo.save(rolefromDB);
			success = true;
		}
		return success;
	}

	@Override
	public boolean dropRole(Integer id) {
		Boolean success = false;
		if (null != getRole(id)) {
			roleRepo.deleteById(id);
			success = true;
		}
		return success;
	}

	@Override
	public Role getRole(Integer id) {
		Optional<Role> opt = roleRepo.findById(id);
		Role role = null;
		if (opt.isPresent()) {
			role = opt.get();
		}
		return role;
	}

}
