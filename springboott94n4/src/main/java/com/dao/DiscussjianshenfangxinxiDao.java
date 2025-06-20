package com.dao;

import com.entity.DiscussjianshenfangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjianshenfangxinxiVO;
import com.entity.view.DiscussjianshenfangxinxiView;


/**
 * 健身房信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-05-18 16:39:29
 */
public interface DiscussjianshenfangxinxiDao extends BaseMapper<DiscussjianshenfangxinxiEntity> {
	
	List<DiscussjianshenfangxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussjianshenfangxinxiEntity> wrapper);
	
	DiscussjianshenfangxinxiVO selectVO(@Param("ew") Wrapper<DiscussjianshenfangxinxiEntity> wrapper);
	
	List<DiscussjianshenfangxinxiView> selectListView(@Param("ew") Wrapper<DiscussjianshenfangxinxiEntity> wrapper);

	List<DiscussjianshenfangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjianshenfangxinxiEntity> wrapper);
	
	DiscussjianshenfangxinxiView selectView(@Param("ew") Wrapper<DiscussjianshenfangxinxiEntity> wrapper);
	

}
