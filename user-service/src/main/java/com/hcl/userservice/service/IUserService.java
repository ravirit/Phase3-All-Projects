package com.hcl.userservice.service;

import com.hcl.userservice.dto.UserDTO;
import com.hcl.userservice.entity.User;
import com.hcl.userservice.vo.UserDepartmentVO;

public interface IUserService {
	
	public  User   addUser(UserDTO userDTO);
	
	public  User   getUserById(long id);
	

	public   UserDepartmentVO    getUserByIdWithDepartment(long userId);
	
	
}
