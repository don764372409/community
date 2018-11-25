package com.yuanmaxinxi.dao.comment;
import com.yuanmaxinxi.domain.comment.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;
@Mapper
@Repository
public interface CommentDAO{
	int insert(Comment obj);

	int update(Comment obj);

	int delete(Long id);

	Comment selectOneById(Long id);

	List<Comment> selectAll();

}