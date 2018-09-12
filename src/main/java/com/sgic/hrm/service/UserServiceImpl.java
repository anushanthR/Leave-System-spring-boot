package com.sgic.hrm.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entity.User;
import com.sgic.hrm.entity.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;

	@Override
	public boolean addUser(User user) {
		userRepo.save(user);
		return true;
	}

	@Override
	public Iterable<User> viewAllUser() {
		return userRepo.findAll();
	}

	@Override
	public boolean updateUser(User user) {
		boolean success = false;
		User userfromDB = viewById(user.getId());
		if (null != userfromDB) {
			userRepo.save(user);
			success = true;
		}
		return success;
	}

	@Override
	public User viewById(Integer id) {
		Optional<User> opt = userRepo.findById(id);
		User user = null;
		if (opt.isPresent()) {
			user = opt.get();
		}
		return user;
	}

	@Override
	public boolean dropUser(Integer id) {
		Boolean success = false;
		if (null != viewById(id)) {
			userRepo.deleteById(id);
			success = true;
		}
		return success;
	}

}
