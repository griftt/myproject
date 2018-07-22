package com.controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.data.ResultMap;
import com.entity.Admin;
import com.entity.Query;
import com.serviceImpl.AdminService;
import com.util.CodeUtil;


@Controller
@RequestMapping("/adminLogin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/code.action")
	public void getCode(HttpServletResponse response,HttpSession session){
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		String code=CodeUtil.number();
		
		output=(ByteArrayOutputStream) CodeUtil.handCode(CodeUtil.codeImg(code));
		try {
			ServletOutputStream out = response.getOutputStream();
			System.out.println(code);
			session.setAttribute("code", code);
			output.writeTo(out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("unused")
	@RequestMapping("/login.action")
	public String login(Admin admin,String code ,Model model,HttpSession session){
		String mycode=(String) session.getAttribute("code");
		mycode=mycode.toUpperCase();
		System.out.println(mycode+"mine and other "+code);
		if(code==null){
			return "login";
		}else{
			code=code.toUpperCase();
			if(!mycode.equals(code)){
				return "login";
			}
		}
		
		System.err.println(admin.getAccount()+"000000000000000000000000"+admin.getPwd());
		if(admin==null){
			return "login";
			
		}else{
			if(admin.getAccount()==null||admin.getPwd()==null){
				return "login";
			}else{
				Admin admin2=adminService.findAdmin(admin);
				session.setAttribute("admin", admin2);
				model.addAttribute("admin",admin2);
				return "main";
			}
		}
		
		
	}
	
	
	@RequestMapping("/loginOut.action")
	public String loginOut(HttpSession session){
		session.invalidate();
		return "login";
		
		
	}
	
	
	
	@RequestMapping("/adminPage.action")
	@ResponseBody
	public ResultMap find(Integer page,Integer limit){
		if(page<=0||limit<=0){
			page=1;
			limit=10;
		}
		System.err.println(page+"and "+limit);
		int count=adminService.countAll();
		List<Admin> list = adminService.selectPage(new Query((page-1)*limit,limit));
		return new ResultMap(0,"",list,count);
	}@RequestMapping("/deleteAdmin.action")
	@ResponseBody
	public boolean  deleteAdmin(Integer id){
		if(id<=0){
			return false;
		}
		System.err.println(id);
		//boolean b =adminService.deleteAdmin(id);
		
		return true;
	}
	
	
	
}
