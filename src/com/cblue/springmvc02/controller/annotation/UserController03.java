package com.cblue.springmvc02.controller.annotation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;

import com.cblue.springmvc01.controller.User;

//控制器的注解
@Controller
@RequestMapping("product")
public class UserController03 {

	@RequestMapping("/queryUser01")
	//@RequestMapping(value="/queryUser",method={RequestMethod.POST})
	public ModelAndView queryUser() {
		// TODO Auto-generated method stub
		System.out.println("UserController03---");
		
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
		
		//modelAndView.setViewName("/WEB-INF/jsp/userlist.jsp");
		//添加前缀和后缀后
		modelAndView.setViewName("userlist");
		
		return modelAndView;
		
	}
	
	@RequestMapping("/queryUser02")
	public String queryUserString(Model model) {
		// TODO Auto-generated method stub
		System.out.println("UserController03---queryUserString");
		
		List<User> allUser = new ArrayList<User>();
		
		User user1 = new User();
		user1.setId(1);
		user1.setName("zhangsan");
		allUser.add(user1);
		
		User user2 = new User();
		user2.setId(1);
		user2.setName("zhangsan");
		allUser.add(user2);
		
		//等同于modelAndView.addObject("alluser", allUser);
		  model.addAttribute("alluser", allUser);
		  
		  
		//modelAndView.setViewName("/WEB-INF/jsp/userlist.jsp");
		
		  
		 //重定向 
		 //return "redirect:queryUser01";
		 //转发，地址栏不变
		 return "forward:queryUser01"; 
		
	}
	
	
	@RequestMapping("/queryUser03")
	public void queryUserVoid(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		System.out.println("UserController03---queryUserVoid");
		
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
