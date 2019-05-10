package com.capgemini.userinfoservice.service;

import com.capgemini.userinfoservice.entity.User;

public interface UserService {

	public User addNewUser(User user);
	public User getUserDetail(int userId);
	public User getUserDetailByMail(String userEmail);
	public User updateUserDetail(User user);
	public void deleteUser(int userId);
	public User getUserDetailByName(String userName);
}
