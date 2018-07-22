package com.serviceInterface;

import java.util.List;

import com.entity.Query;
import com.entity.WeiBo;

public interface WeiBoServiceInterface {

	public List<WeiBo> selectAll();

	public List<WeiBo> selectPage(Query q);

	public List<WeiBo> findByAccount(String account);

	public int countAll();
	public int countUserWeibo(int userId);

	public boolean deleteWeiBoById(int id);

	public boolean updateWeiBo(WeiBo weibo);

	public boolean insertWeiBo(WeiBo weibo);
}
