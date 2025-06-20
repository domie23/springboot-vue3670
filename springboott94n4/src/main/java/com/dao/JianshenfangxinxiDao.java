package com.dao;

import com.entity.JianshenfangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianshenfangxinxiVO;
import com.entity.view.JianshenfangxinxiView;


/**
 * 健身房信息
 * 
 * @author 
 * @email 
 * @date 2022-05-18 16:39:28
 */
public interface JianshenfangxinxiDao extends BaseMapper<JianshenfangxinxiEntity> {
	
	List<JianshenfangxinxiVO> selectListVO(@Param("ew") Wrapper<JianshenfangxinxiEntity> wrapper);
	
	JianshenfangxinxiVO selectVO(@Param("ew") Wrapper<JianshenfangxinxiEntity> wrapper);
	
	List<JianshenfangxinxiView> selectListView(@Param("ew") Wrapper<JianshenfangxinxiEntity> wrapper);

	List<JianshenfangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JianshenfangxinxiEntity> wrapper);
	
	JianshenfangxinxiView selectView(@Param("ew") Wrapper<JianshenfangxinxiEntity> wrapper);
	

}
