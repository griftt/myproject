package com.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entity.Query;
import com.entity.User;
import com.mapper.UserMapper;
import com.serviceInterface.UserServiceInterface;
@Service
public class UserServiceImpl implements UserServiceInterface {

	@Resource(name="userMapper")
	private UserMapper userMapper;
	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> selectPage(Query q) {
		// TODO Auto-generated method stub
		if(q!=null){
			return userMapper.selectPage(q);
		}
		
		
		return null;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return userMapper.countAll();
	}

	@Override
	public List<User> findByAccount(String account) {
		// TODO Auto-generated method stub
		if(account==null || "".equals(account)||!account.startsWith("7")){
			return null;
		}
		return userMapper.findByAccount("%"+account+"%");
	}

	@Override
	public User userLogin(User user) {
		if(user==null){
			return null;
		}
		if(user.getAccount()==null||user.getPwd()==null){
			return null;
		}
		
		return userMapper.userLogin(user);
	}

	
	
}
