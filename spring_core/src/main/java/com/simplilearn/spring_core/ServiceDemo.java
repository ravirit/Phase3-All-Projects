package com.simplilearn.spring_core;

public class ServiceDemo {
	
	private DAO dao;
	
	
	public ServiceDemo() {
		
	}

	public ServiceDemo(DAO dao) {
		super();
		this.dao = dao;
	}

	public DAO getDao() {
		return dao;
	}

	public void setDao(DAO dao) {
		this.dao = dao;
	}
	
	
	
	
	

}
