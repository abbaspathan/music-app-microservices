package com.capgemini.userinfoservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.userinfoservice.dao.UserDao;
import com.capgemini.userinfoservice.entity.Authenticate;
import com.capgemini.userinfoservice.entity.User;
import com.capgemini.userinfoservice.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	@Override
	public User addNewUser(User user) {
		User user1 = getUserDetailByMail(user.getUserEmail());
		if (user1 == null) {
			return dao.insert(user);
		} else {
			return null;
		}
	}

	@Override
	public User getUserDetailByMail(String userEmail) {
		return dao.findByuserEmail(userEmail);
	}

	@Override
	public User updateUserDetail(User user) {

		return dao.save(user);
	}

	@Override
	public User getUserDetailByName(String userName) {
		return dao.findByuserName(userName);
	}

	@Override
	public List<User> getAllUser() {
		return dao.findAll();
	}

	@Override
	public User authenticateUser(Authenticate authenticate) {
		User user = getUserDetailByMail(authenticate.getUserEmail());
		if (user != null) {
			if (user.getUserPassword().equals(authenticate.getUserPassword())) {
				return user;
			}
		}
		return null;
	}

}
