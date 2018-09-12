package com.sgic.hrm.service;

import com.sgic.hrm.entity.User;

public interface UserService {

	boolean addUser(User user);
	Iterable<User> viewAllUser();
	boolean updateUser(User user);
	User viewById(Integer id);
	boolean dropUser(Integer id);
}
