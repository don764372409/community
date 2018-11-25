package com.yuanmaxinxi.dao.commentreply;
import com.yuanmaxinxi.domain.commentreply.CommentReply;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;
@Mapper
@Repository
public interface CommentReplyDAO{
	int insert(CommentReply obj);

	int update(CommentReply obj);

	int delete(Long id);

	CommentReply selectOneById(Long id);

	List<CommentReply> selectAll();

}