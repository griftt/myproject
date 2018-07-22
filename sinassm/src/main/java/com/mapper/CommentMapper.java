package com.mapper;

import java.util.List;

import com.entity.Comment;
import com.entity.Query;
import com.entity.WeiBo;

public interface CommentMapper {
	public List<Comment> selectAll();
	public List<Comment> selectPage(Query q);
	public List<Comment> findByObjectId(int objectId);
	public int countAll();
	public int countWeiboComment(int objectId);
	public void deleteComment(int id);
	public void updateComment(WeiBo weibo);
	public void insertComment(WeiBo weibo);

}
