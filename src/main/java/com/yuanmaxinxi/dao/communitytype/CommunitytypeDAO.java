package com.yuanmaxinxi.dao.communitytype;
import com.yuanmaxinxi.domain.communitytype.Communitytype;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;
@Mapper
@Repository
public interface CommunitytypeDAO{
	int insert(Communitytype obj);

	int update(Communitytype obj);

	int delete(Long id);

	Communitytype selectOneById(Long id);

	List<Communitytype> selectAll();

}