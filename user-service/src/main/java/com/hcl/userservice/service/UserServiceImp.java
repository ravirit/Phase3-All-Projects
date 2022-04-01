package com.hcl.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hcl.userservice.dto.UserDTO;
import com.hcl.userservice.entity.User;
import com.hcl.userservice.repository.UserRepository;
import com.hcl.userservice.vo.Department;
import com.hcl.userservice.vo.UserDepartmentVO;

@Service
public class UserServiceImp implements IUserService {

	@Autowired
	UserRepository repo;

	@Autowired
	RestTemplate restTemplate;

	@Override
	public User addUser(UserDTO userDTO) {

		User user = new User();

		user.setUsername(userDTO.getUsername());
		user.setEmail(userDTO.getEmail());
		user.setDepartmentId(userDTO.getDepartmentId());

		return repo.save(user);
	}

	@Override
	public User getUserById(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(new User());
	}

	@Override
	// it will take user from repo and it takes dept from dept microservice
	public UserDepartmentVO getUserByIdWithDepartment(long userId) {

		// get user by id from local repo

		User user = this.getUserById(userId); // calling getUserById from current service class

		long deptId = user.getDepartmentId();

		// get dept from dept microservice
		ResponseEntity<Department> responseEntity = restTemplate
				.getForEntity("http://localhost:8181/v1/department/get/" + deptId, Department.class);

				// localhost:PORTNO/SERVICE
		
		//post 
			//restTemplate.postForEntity(url, request, responseType)
		
		Department department = responseEntity.getBody();

		// set user+dept to the UserDepartmentVO obj and return

		UserDepartmentVO userDepartmentVO = new UserDepartmentVO(user, department);

		return userDepartmentVO;
	}

}
