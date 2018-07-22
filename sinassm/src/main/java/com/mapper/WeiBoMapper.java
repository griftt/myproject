package com.mapper;

import java.util.List;

import com.entity.Query;
import com.entity.WeiBo;

public interface WeiBoMapper {
	public List<WeiBo> selectAll();
	public List<WeiBo> selectPage(Query q);
	public List<WeiBo> findByAccount(String account);
	public int countAll();
	public int countUserWeibo(int userId);
	public void deleteWeiBoById(int id);
	public void updateWeiBo(WeiBo weibo);
	public void insertWeiBo(WeiBo weibo);
	
}
