package com.cblue.springmvc05.annotation.mvc;

import java.util.List;

public interface UserService {
	
	public void addUser(User user);
	
	public List<User> getAllUser();
	
	public User getUser(int id);
	
	public void updateUser(User user);
	
	public void deleteUesr(User user);
	
	public void deleteUserBatch(Integer[] ids);

}
