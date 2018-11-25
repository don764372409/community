package com.yuanmaxinxi.service.communitytype;
import com.yuanmaxinxi.domain.communitytype.Communitytype;
import com.yuanmaxinxi.dao.communitytype.CommunitytypeDAO;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
public class CommunitytypeService{
	@Autowired
	private CommunitytypeDAO communitytypeDAO;
	@Transactional
	public int insert(Communitytype obj){
		return communitytypeDAO.insert(obj);
	}


	@Transactional
	public int update(Communitytype obj){
		return communitytypeDAO.update(obj);
	}


	@Transactional
	public int delete(Long id){
		return communitytypeDAO.delete(id);
	}


	public Communitytype selectOneById(Long id){
		return communitytypeDAO.selectOneById(id);
	}


	public List<Communitytype> selectAll(){
		return communitytypeDAO.selectAll();
	}

}