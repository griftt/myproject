package com.serviceInterface;

import java.util.List;

import com.entity.Admin;
import com.entity.Query;

public interface AdminServiceInterface {
	public List<Admin> SelectAll();
	public List<Admin> selectPage(Query aq);
	public int countAll();
	public boolean deleteAdmin(int id);
	public boolean insertAdmin(Admin admin);
	public boolean updateAdmin(Admin admin);
}
