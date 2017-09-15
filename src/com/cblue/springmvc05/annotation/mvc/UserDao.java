package com.cblue.springmvc05.annotation.mvc;

import java.util.List;

public interface UserDao {
	
	
	
	public List<User> getUsers();
	
	public void save(User user);
	
	public User getUser(Integer id);
	
	public void update(User user);
	
	public void delete(User user);

}
