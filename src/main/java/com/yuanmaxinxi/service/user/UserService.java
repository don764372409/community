package com.yuanmaxinxi.service.user;
import com.yuanmaxinxi.domain.user.User;
import com.yuanmaxinxi.dao.user.UserDAO;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
public class UserService{
	@Autowired
	private UserDAO userDAO;
	@Transactional
	public int insert(User obj){
		return userDAO.insert(obj);
	}


	@Transactional
	public int update(User obj){
		return userDAO.update(obj);
	}


	@Transactional
	public int delete(Long id){
		return userDAO.delete(id);
	}


	public User selectOneById(Long id){
		return userDAO.selectOneById(id);
	}


	public List<User> selectAll(){
		return userDAO.selectAll();
	}

}