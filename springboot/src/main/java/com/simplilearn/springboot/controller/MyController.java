package com.simplilearn.springboot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	
	
	@RequestMapping(value="/get",method = RequestMethod.GET) // Mapping Handler
	@ResponseBody
	public String  getMessage() { //Model and View
		
		return "Hello friends from Get Request";
		
	}
	
	@RequestMapping(value = "/post",method = RequestMethod.POST  )
	//@ResponseBody
	public String  getData(HttpServletRequest request,HttpServletResponse response,HttpSession session)  {
		
			String uname =	request.getParameter("uname");
		
			
				session.setAttribute("uname", uname);
				
				return "success";  // view name by default prefix view folder , suffix is .jsp
 		
	}
	
	

}
