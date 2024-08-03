package com.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Service.UserService;
import com.demo.model.SystemUser;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public String registerUser(@RequestBody SystemUser systemUser) {
		return userService.newUser(systemUser);
	}
	
	@GetMapping("/userlist")
	public List<SystemUser> userList() {
		return userService.users();
	}
}
