package com.cblue.springmvc05.annotation.mvc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	
	
	//模拟数据
	private static Map<Integer,User> users = new HashMap<Integer,User>();
	private static Integer count= 0;
	static{
		for(int i=0;i<10;i++){
			 count++;
			 User user = new User();
			 user.setId(count);
			 user.setName("zhangsan"+count);
			 users.put(count, user);
		}
	}
	

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return new ArrayList(users.values());
	}
	
	
	public void save(User user) {
		// TODO Auto-generated method stub
       System.out.println("save data");
       users.put(user.getId(), user);
	}


	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		return users.get(id);
	}


	public void update(User user) {
		// TODO Auto-generated method stub
		users.put(user.getId(), user);
	}


	public void delete(User user) {
		// TODO Auto-generated method stub
		users.remove(user.getId());
	}

	


}
