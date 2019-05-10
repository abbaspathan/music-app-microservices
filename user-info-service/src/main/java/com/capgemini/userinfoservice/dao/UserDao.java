package com.capgemini.userinfoservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.userinfoservice.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

	public User findByuserEmail(String userEmail);
	public User findByuserName(String  userName);
}
