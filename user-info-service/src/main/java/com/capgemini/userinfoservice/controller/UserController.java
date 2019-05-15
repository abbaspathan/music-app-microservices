package com.capgemini.userinfoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.userinfoservice.entity.User;
import com.capgemini.userinfoservice.service.UserService;

@RestController
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/user")
	public ResponseEntity<User> addNewUser(@RequestBody User user) {
		User user1 = userService.addNewUser(user);
		return new ResponseEntity<User>(user1, HttpStatus.CREATED);
	}

	@GetMapping("/user/bymail/{userEmail}")
	public ResponseEntity<User> getUserDetailsByMail(@PathVariable String userEmail) {
		User user = userService.getUserDetailByMail(userEmail);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@GetMapping("/user/username/{userName}")
	public ResponseEntity<User> getUserDetailsByUserName(@PathVariable String userName) {
		User user = userService.getUserDetailByName(userName);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}  
	  
	  @PutMapping("/user") public ResponseEntity<User>
	  updateUserDetail(@RequestBody User user ) { User
	  user1 = userService.updateUserDetail(user); return new
	  ResponseEntity<User>(user1, HttpStatus.OK); }
	  
	  
	 

}
