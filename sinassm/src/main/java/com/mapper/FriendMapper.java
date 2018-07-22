package com.mapper;

import java.util.List;

import com.entity.Comment;
import com.entity.Friend;
import com.entity.Query;
import com.entity.WeiBo;

public interface FriendMapper {
	public List<Friend> selectAll();
	public List<Friend> selectPage(Query q);
	public int countAll();
	public List<Friend> findByuserId(int userId);
	public int countUserFriend(int objectId);
	public void deleteUserFriend(int id);
	public void updateUserFriend(Friend fri);
	public void insertUserFriend(Friend fri);
	


}
