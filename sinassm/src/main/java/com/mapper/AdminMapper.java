package com.mapper;

import java.util.List;

import com.entity.Admin;
import com.entity.Query;

public interface AdminMapper {
	public List<Admin> selectAll();

	public Admin findAdmin(Admin admin);
	public List<Admin> selectPage(Query aq);
	public int countAll();
	public boolean deleteAdmin(int id);
	public boolean insertAdmin(Admin admin);
	public boolean updateAdmin(Admin admin);
}
