package com.serviceInterface;

import java.util.List;

import com.entity.Friend;
import com.entity.Query;

public interface FriendServiceInterface {
	public List<Friend> selectAll();
	public List<Friend> selectPage(Query q);
	public int countAll();
	public List<Friend> findByuserId(int userId);
	public int countUserFriend(int objectId);
	public void updateUserFriend(Friend fri);
	public void insertUserFriend(Friend fri);
	void deleteUserFriend(int id);
}
