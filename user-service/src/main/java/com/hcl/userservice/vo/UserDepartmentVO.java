package com.hcl.userservice.vo;

import com.hcl.userservice.entity.User;





public class UserDepartmentVO {
	
	
	private  User user;
	private Department department;
	
	
	public UserDepartmentVO() {
		
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public UserDepartmentVO(User user, Department department) {
		super();
		this.user = user;
		this.department = department;
	}
	
	
	
	

}
