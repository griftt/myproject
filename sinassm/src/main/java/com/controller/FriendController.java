package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.data.ResultMap;
import com.entity.Friend;
import com.entity.Query;
import com.serviceImpl.FriendServiceImpl;

@Controller
@RequestMapping("/friend")
public class FriendController {
	
	@Autowired
	private FriendServiceImpl fsi;
	@RequestMapping("/userFriend.action")
	@ResponseBody
	public ResultMap userFriend(Integer page,Integer limit,@RequestParam("id") Integer userId){
		if(userId<=0||page<=0||limit<=0){
			return null;
		}
		int num=fsi.countUserFriend(userId);
		Query q = new Query();
		q.setUserId(userId);
		q.setLimit(limit);
		q.setPage((page-1)*limit);
		List<Friend> list = fsi.selectPage(q);
		System.err.println(list);
		return new ResultMap(0,"", list,num);
		
	}
	

}
