package com.dao;

import com.entity.HuodongrichengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuodongrichengVO;
import com.entity.view.HuodongrichengView;


/**
 * 活动日程
 * 
 * @author 
 * @email 
 * @date 2022-05-18 16:39:28
 */
public interface HuodongrichengDao extends BaseMapper<HuodongrichengEntity> {
	
	List<HuodongrichengVO> selectListVO(@Param("ew") Wrapper<HuodongrichengEntity> wrapper);
	
	HuodongrichengVO selectVO(@Param("ew") Wrapper<HuodongrichengEntity> wrapper);
	
	List<HuodongrichengView> selectListView(@Param("ew") Wrapper<HuodongrichengEntity> wrapper);

	List<HuodongrichengView> selectListView(Pagination page,@Param("ew") Wrapper<HuodongrichengEntity> wrapper);
	
	HuodongrichengView selectView(@Param("ew") Wrapper<HuodongrichengEntity> wrapper);
	

}
