package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.data.ResultMap;
import com.entity.Query;
import com.entity.WeiBo;
import com.serviceImpl.WeiBoServiceImpl;

@Controller
@RequestMapping("/weibo")
public class WeiboController {
	@Resource(name="weiBoServiceImpl")
	private WeiBoServiceImpl wbs;
	@RequestMapping("/weiboPage.action")
	@ResponseBody
	public ResultMap seletePage(Integer page,Integer limit,@RequestParam("id") Integer userId){
		System.out.println(page+"'"+limit+"'"+userId);
		if(page==null||limit==null||userId==null){
			return null;
		}
		if(page<=0||limit<=0||userId<=0){
			return null;
		}
		Query query = new Query();
		query.setUserId(userId);
		query.setLimit(limit);
		query.setPage((page-1)*limit);
		List<WeiBo> list = wbs.selectPage(query);
		int count=wbs.countUserWeibo(userId);
		if(list.isEmpty()){
			return new ResultMap(0,"内容为空",list,300);
		}
		
		return new ResultMap(0,"内容为空",list,count);
		
	}
	

}
