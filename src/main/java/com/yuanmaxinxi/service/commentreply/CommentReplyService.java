package com.yuanmaxinxi.service.commentreply;
import com.yuanmaxinxi.domain.commentreply.CommentReply;
import com.yuanmaxinxi.dao.commentreply.CommentReplyDAO;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
public class CommentReplyService{
	@Autowired
	private CommentReplyDAO commentReplyDAO;
	@Transactional
	public int insert(CommentReply obj){
		return commentReplyDAO.insert(obj);
	}


	@Transactional
	public int update(CommentReply obj){
		return commentReplyDAO.update(obj);
	}


	@Transactional
	public int delete(Long id){
		return commentReplyDAO.delete(id);
	}


	public CommentReply selectOneById(Long id){
		return commentReplyDAO.selectOneById(id);
	}


	public List<CommentReply> selectAll(){
		return commentReplyDAO.selectAll();
	}

}