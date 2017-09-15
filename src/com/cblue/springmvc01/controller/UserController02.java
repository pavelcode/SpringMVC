package com.cblue.springmvc01.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;
import org.springframework.web.servlet.mvc.Controller;

public class UserController02 implements HttpRequestHandler {

	public void handleRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		// TODO Auto-generated method stub
		System.out.println("UserController02---");
		
		List<User> allUser = new ArrayList<User>();
		
		User user1 = new User();
		user1.setId(1);
		user1.setName("zhangsan");
		allUser.add(user1);
		
		User user2 = new User();
		user2.setId(1);
		user2.setName("zhangsan");
		allUser.add(user2);
		
		request.setAttribute("alluser", allUser);
		request.getRequestDispatcher("/WEB-INF/jsp/userlist.jsp").forward(request, response);
		
		
		
	}

	
}
