package com.yuanmaxinxi.dao.community;
import com.yuanmaxinxi.domain.community.Community;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;
@Mapper
@Repository
public interface CommunityDAO{
	int insert(Community obj);

	int update(Community obj);

	int delete(Long id);

	Community selectOneById(Long id);

	List<Community> selectAll();

}