package com.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entity.Admin;
import com.entity.Query;
import com.mapper.AdminMapper;
import com.serviceInterface.AdminServiceInterface;

@Service
public class AdminService implements  AdminServiceInterface{
	
	@Resource(name="adminMapper")
	private AdminMapper adminMapper;

	@Override
	public List<Admin> SelectAll() {
		// TODO Auto-generated method stub
		List<Admin> admins = adminMapper.selectAll();
		return admins;
	}

	public Admin findAdmin(Admin admin) {
		// TODO Auto-generated method stub
		if(admin!=null){
			return adminMapper.findAdmin(admin);
		}
		
		return null;
	}

	@Override
	public List<Admin> selectPage(Query aq) {
		// TODO Auto-generated method stub
		List<Admin> admins =null;
		if(aq!=null){
			admins =adminMapper.selectPage(aq);
		}
		return admins;
	}

	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return adminMapper.countAll();
	}

	@Override
	public boolean deleteAdmin(int id) {
		// TODO Auto-generated method stub
		if(id<=0){
			return false; 
		}
		
		adminMapper.deleteAdmin(id);
		return true;
	}

	@Override
	public boolean insertAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
