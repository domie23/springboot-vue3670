package com.dao;

import com.entity.KechengquxiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengquxiaoVO;
import com.entity.view.KechengquxiaoView;


/**
 * 课程取消
 * 
 * @author 
 * @email 
 * @date 2022-05-18 16:39:28
 */
public interface KechengquxiaoDao extends BaseMapper<KechengquxiaoEntity> {
	
	List<KechengquxiaoVO> selectListVO(@Param("ew") Wrapper<KechengquxiaoEntity> wrapper);
	
	KechengquxiaoVO selectVO(@Param("ew") Wrapper<KechengquxiaoEntity> wrapper);
	
	List<KechengquxiaoView> selectListView(@Param("ew") Wrapper<KechengquxiaoEntity> wrapper);

	List<KechengquxiaoView> selectListView(Pagination page,@Param("ew") Wrapper<KechengquxiaoEntity> wrapper);
	
	KechengquxiaoView selectView(@Param("ew") Wrapper<KechengquxiaoEntity> wrapper);
	

}
