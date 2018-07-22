package com.serviceInterface;

import java.util.List;

import com.entity.Query;
import com.entity.User;

public interface UserServiceInterface {
	public void deleteUserById(int id);
	public User selectById(int id);
	public List<User> selectPage(Query q);
	public void updateUser(User user);
	public void insertUser(User user);
	public int countAll();
	public List<User> findByAccount(String account);
	public User userLogin(User user);
}
