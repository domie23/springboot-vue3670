package com.dao;

import com.entity.QicaifenpeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QicaifenpeiVO;
import com.entity.view.QicaifenpeiView;


/**
 * 器材分配
 * 
 * @author 
 * @email 
 * @date 2022-05-18 16:39:28
 */
public interface QicaifenpeiDao extends BaseMapper<QicaifenpeiEntity> {
	
	List<QicaifenpeiVO> selectListVO(@Param("ew") Wrapper<QicaifenpeiEntity> wrapper);
	
	QicaifenpeiVO selectVO(@Param("ew") Wrapper<QicaifenpeiEntity> wrapper);
	
	List<QicaifenpeiView> selectListView(@Param("ew") Wrapper<QicaifenpeiEntity> wrapper);

	List<QicaifenpeiView> selectListView(Pagination page,@Param("ew") Wrapper<QicaifenpeiEntity> wrapper);
	
	QicaifenpeiView selectView(@Param("ew") Wrapper<QicaifenpeiEntity> wrapper);
	

}
