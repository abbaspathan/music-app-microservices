package com.capgemini.userinfoservice.service;

import java.util.List;

import com.capgemini.userinfoservice.entity.Authenticate;
import com.capgemini.userinfoservice.entity.User;

public interface UserService {

	public User addNewUser(User user);

	public User getUserDetailByMail(String userEmail);

	public User updateUserDetail(User user);

	public User getUserDetailByName(String userName);

	public List<User> getAllUser();

	public User authenticateUser(Authenticate authenticate);

}
