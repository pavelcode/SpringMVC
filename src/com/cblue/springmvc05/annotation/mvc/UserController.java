package com.cblue.springmvc05.annotation.mvc;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@Resource
	UserService userService;

	//显示全部数据
	@RequestMapping("alluser")
	public String listUser(Map<String,Object> model){
		System.out.println("UserController--listUser");
		List<User> users = userService.getAllUser();
		model.put("alluser", users);
		return "userlist";
	}
	//跳转到新增页面
	@RequestMapping("saveUserUI.action")
	public String saveUserUI(HttpServletRequest request){
		System.out.println("UserController--saveUserUI");
		System.out.println(request.getRequestURI());
		return "useradd";
	}
	
	//新增user
	//原理：springmvc通过页面提交的requset对象，自动调用getParameter（）获得用户提交的值
	//然后找到对象中有一个对应的setXXX方法，如果有，设置值
	@RequestMapping("saveUser.action")
	public String saveUser(Integer id,String name){ //自动接收参数，自动转型
		System.out.println("UserController--saveUser");
		User user = new User();
		user.setId(id);
		user.setName(name);
		System.out.println("UserController--saveUser--"+user);
		userService.addUser(user);
		return "redirect:alluser.action";  //重定向
	}
	
	//跳转到修改页面
	@RequestMapping("updateUserUI.action")
	public String updateUserUI(Integer id,Model model){
		System.out.println("UserController--updateUserUI");
		System.out.println("UserController--updateUserUI--"+id);
		User user = userService.getUser(id);
		System.out.println("UserController--updateUserUI--"+user);
		//使用spring添加集合中
		model.addAttribute("user", user);
		return "userupdate";
	}
	
	//更新user
	@RequestMapping("updateUser.action")
	public String updateUser(User user){
		System.out.println("UserController--updateUser");
		System.out.println("UserController--updateUser--"+user);
		userService.updateUser(user);
		return "redirect:alluser.action";  //重定向
	}
	
	//删除user
	@RequestMapping("deleteUser.action")
	public String deleteUser(User user){
		System.out.println("UserController--deleteUser");
		System.out.println("UserController--deleteUser--"+user);
		userService.deleteUesr(user);
		return "redirect:alluser.action";  //重定向
	}
	
	//批量删除
	@RequestMapping("batchdeleteUser")
	public String batchdeleteUser(Integer[] checkid){
		System.out.println("UserController--batchdeleteUser");
		for(int i=0;i<checkid.length;i++){
			System.out.println("--id="+checkid[i]);
		}
		userService.deleteUserBatch(checkid);
		return "redirect:alluser.action"; 
	}

}
