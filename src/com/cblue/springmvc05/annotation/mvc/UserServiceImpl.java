package com.cblue.springmvc05.annotation.mvc;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	UserDao userDao;

	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);

	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userDao.getUsers();
	}

	public User getUser(int id) {
		// TODO Auto-generated method stub
		return userDao.getUser(id);
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.update(user);
	}

	public void deleteUesr(User user) {
		// TODO Auto-generated method stub
		userDao.delete(user);
	}

	public void deleteUserBatch(Integer[] ids) {
		// TODO Auto-generated method stub
		for(int i=0;i<ids.length;i++){
			User user = new User();
			user.setId(ids[i]);
			userDao.delete(user);
		}
	}

}
