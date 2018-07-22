package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.junit.runners.Parameterized.Parameter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.data.ResultMap;
import com.entity.Query;
import com.entity.User;
import com.serviceImpl.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource(name="userServiceImpl")
	private UserServiceImpl us;
	
	@RequestMapping("/loadUser.action")
	@ResponseBody
	public ResultMap loadUser(int page,int limit){
		System.out.println(page+"-----------"+limit);
		int count= us.countAll();
		List<User> users=us.selectPage(new Query(limit*(page-1),limit));
		return new ResultMap(0,"",users,count);
	}
	@RequestMapping("/findUser.action")
	@ResponseBody
	public ResultMap findUser(User user){
		
		/*String account= "7";
		 
		System.out.println(user.getAccount()+"-----------");*/
		System.err.println(user);
		String account =user.getAccount();
		System.err.println(account);
		int count= us.countAll();
		List<User> users=null;
		if(account!=null&&!"".equals(account)){
			users=us.findByAccount(account);
		}
		return new ResultMap(0,"",users,count);
	}
	@RequestMapping("/userLogin.action")
	public String login(User user,Model model ){
		if(user==null){
			return "sinalogin";
		}
		if(user.getAccount()==null||user.getPwd()==null){
			return null;
		}
		User user2=us.userLogin(user);
		if(user!=null){
			model.addAttribute("user",user2);
		}
		return "sina";
	}
	
	
	
}
