package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjianshenfangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjianshenfangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjianshenfangxinxiView;


/**
 * 健身房信息评论表
 *
 * @author 
 * @email 
 * @date 2022-05-18 16:39:29
 */
public interface DiscussjianshenfangxinxiService extends IService<DiscussjianshenfangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjianshenfangxinxiVO> selectListVO(Wrapper<DiscussjianshenfangxinxiEntity> wrapper);
   	
   	DiscussjianshenfangxinxiVO selectVO(@Param("ew") Wrapper<DiscussjianshenfangxinxiEntity> wrapper);
   	
   	List<DiscussjianshenfangxinxiView> selectListView(Wrapper<DiscussjianshenfangxinxiEntity> wrapper);
   	
   	DiscussjianshenfangxinxiView selectView(@Param("ew") Wrapper<DiscussjianshenfangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjianshenfangxinxiEntity> wrapper);
   	

}

