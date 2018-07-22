package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Query;
import com.entity.WeiBo;
import com.mapper.WeiBoMapper;
import com.serviceInterface.WeiBoServiceInterface;

@Service
public class WeiBoServiceImpl implements WeiBoServiceInterface {
	
	@Autowired
	private WeiBoMapper wbm;
	
	@Override
	public List<WeiBo> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WeiBo> selectPage(Query q) {
		if(q==null){
			System.err.println(1);
			return null;
		}
		if(q.getPage()<0||q.getLimit()<=0){
			System.err.println(2);
			return null;
		}
		
		 
		
		return wbm.selectPage(q);
	}

	@Override
	public List<WeiBo> findByAccount(String account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAll() {
		return wbm.countAll();
	}

	@Override
	public boolean deleteWeiBoById(int id) {
		return false;
	}

	@Override
	public boolean updateWeiBo(WeiBo weibo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertWeiBo(WeiBo weibo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int countUserWeibo(int userId) {
		// TODO Auto-generated method stub
		if(userId<=0){
			return 0;
			
		}
		return 	wbm.countUserWeibo(userId);
	}

}
