package com.yuanmaxinxi.service.comment;
import com.yuanmaxinxi.domain.comment.Comment;
import com.yuanmaxinxi.dao.comment.CommentDAO;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
public class CommentService{
	@Autowired
	private CommentDAO commentDAO;
	@Transactional
	public int insert(Comment obj){
		return commentDAO.insert(obj);
	}


	@Transactional
	public int update(Comment obj){
		return commentDAO.update(obj);
	}


	@Transactional
	public int delete(Long id){
		return commentDAO.delete(id);
	}


	public Comment selectOneById(Long id){
		return commentDAO.selectOneById(id);
	}


	public List<Comment> selectAll(){
		return commentDAO.selectAll();
	}

}