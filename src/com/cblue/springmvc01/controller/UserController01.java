package com.cblue.springmvc01.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;
import org.springframework.web.servlet.mvc.Controller;

public class UserController01 implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("UserController01---");
		
		List<User> allUser = new ArrayList<User>();
		
		User user1 = new User();
		user1.setId(1);
		user1.setName("zhangsan");
		allUser.add(user1);
		
		User user2 = new User();
		user2.setId(1);
		user2.setName("zhangsan");
		allUser.add(user2);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("alluser", allUser);
		modelAndView.setViewName("/WEB-INF/jsp/userlist.jsp");
		
		return modelAndView;
	}

	
}
