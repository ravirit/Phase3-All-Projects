package com.hcl.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.userservice.dto.UserDTO;
import com.hcl.userservice.entity.User;
import com.hcl.userservice.service.IUserService;
import com.hcl.userservice.vo.UserDepartmentVO;

@RestController
@RequestMapping("/v1/user")
public class UserController {
	
	
	@Autowired
	IUserService service;
	
	@PostMapping("/add")
	public  User  addUser(@RequestBody UserDTO dto) {
		
		
		return	service.addUser(dto);
		
		
	}
	
	
	@GetMapping("/get/{id}")
	public  User  getUserById(@PathVariable long id) {
		
		return service.getUserById(id);
		
		
	}
	
	
	@GetMapping("/get/user-dept/{userId}")
	public  UserDepartmentVO     getUserByIdWithDepartment(@PathVariable long userId) {
		
		
			return service.getUserByIdWithDepartment(userId);
		
		
	}
	
	

}
