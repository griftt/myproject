package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.data.ResultMap;
import com.entity.Comment;
import com.entity.Query;
import com.serviceImpl.CommentServiceImpl;

@Controller
@RequestMapping("/comment")
public class CommentController {
	@Resource(name="commentServiceImpl")
	private CommentServiceImpl cms;
	
	@RequestMapping("/weiboComment.action")
	@ResponseBody
	public ResultMap weiboComment(Integer page,Integer limit,Integer objectId){
		if(page<=0||limit<=0||objectId<=0){
			return null;
		}
		Query q = new Query();
		q.setId(objectId);
		q.setLimit(limit);
		q.setPage((page-1)*limit);
		List<Comment> list = cms.selectPage(q);
		int count =cms.countWeiboComment(objectId);
		System.out.println(list);
		return new ResultMap(0,"",list,count);
	}
	
}
