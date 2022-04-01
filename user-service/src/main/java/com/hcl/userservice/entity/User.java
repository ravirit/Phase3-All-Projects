package com.hcl.userservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name="user_table")
public class User {
	
	@Id
	@GeneratedValue
	private long userId;
	private String username;
	private String email;
	private  long departmentId;  // foreign key
	
	
	
	public User() {
		
		
	}
	
	
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}
	public User(long userId, String username, String email, long departmentId) {
		super();
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.departmentId = departmentId;
	}
	

}
