package com.dao;

import com.entity.QicaixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QicaixinxiVO;
import com.entity.view.QicaixinxiView;


/**
 * 器材信息
 * 
 * @author 
 * @email 
 * @date 2022-05-18 16:39:28
 */
public interface QicaixinxiDao extends BaseMapper<QicaixinxiEntity> {
	
	List<QicaixinxiVO> selectListVO(@Param("ew") Wrapper<QicaixinxiEntity> wrapper);
	
	QicaixinxiVO selectVO(@Param("ew") Wrapper<QicaixinxiEntity> wrapper);
	
	List<QicaixinxiView> selectListView(@Param("ew") Wrapper<QicaixinxiEntity> wrapper);

	List<QicaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<QicaixinxiEntity> wrapper);
	
	QicaixinxiView selectView(@Param("ew") Wrapper<QicaixinxiEntity> wrapper);
	

}
