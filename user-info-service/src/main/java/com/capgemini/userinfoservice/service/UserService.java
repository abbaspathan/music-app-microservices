package com.capgemini.userinfoservice.service;

import com.capgemini.userinfoservice.entity.User;

public interface UserService {

	public User addNewUser(User user);

	public User getUserDetailByMail(String userEmail);

	public User updateUserDetail(User user);

	public User getUserDetailByName(String userName);
	

}
