package com.yuanmaxinxi.service.community;
import com.yuanmaxinxi.domain.community.Community;
import com.yuanmaxinxi.dao.community.CommunityDAO;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
public class CommunityService{
	@Autowired
	private CommunityDAO communityDAO;
	@Transactional
	public int insert(Community obj){
		return communityDAO.insert(obj);
	}


	@Transactional
	public int update(Community obj){
		return communityDAO.update(obj);
	}


	@Transactional
	public int delete(Long id){
		return communityDAO.delete(id);
	}


	public Community selectOneById(Long id){
		return communityDAO.selectOneById(id);
	}


	public List<Community> selectAll(){
		return communityDAO.selectAll();
	}

}