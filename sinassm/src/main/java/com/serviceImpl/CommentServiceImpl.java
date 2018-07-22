package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Comment;
import com.entity.Query;
import com.entity.WeiBo;
import com.mapper.CommentMapper;
import com.serviceInterface.CommentServiceInterface;

@Service
public class CommentServiceImpl implements CommentServiceInterface {

	@Autowired
	private CommentMapper cmp;
	@Override
	public List<Comment> selectAll() {
		return null;
	}

	@Override
	public List<Comment> selectPage(Query q) {
		if(q==null){
			return null;
		}
		if(q.getId()<=0||q.getLimit()<=0||q.getPage()<0){
			return null;
		}
		return  cmp.selectPage(q);
	}

	@Override
	public List<Comment> findByObjectId(int objectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countWeiboComment(int objectId) {
		return cmp.countWeiboComment(objectId);
	}

	@Override
	public void deleteComment(int id) {

	}

	@Override
	public void updateComment(WeiBo weibo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertComment(WeiBo weibo) {
		// TODO Auto-generated method stub

	}

}
