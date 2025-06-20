package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianshenfangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianshenfangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianshenfangxinxiView;


/**
 * 健身房信息
 *
 * @author 
 * @email 
 * @date 2022-05-18 16:39:28
 */
public interface JianshenfangxinxiService extends IService<JianshenfangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianshenfangxinxiVO> selectListVO(Wrapper<JianshenfangxinxiEntity> wrapper);
   	
   	JianshenfangxinxiVO selectVO(@Param("ew") Wrapper<JianshenfangxinxiEntity> wrapper);
   	
   	List<JianshenfangxinxiView> selectListView(Wrapper<JianshenfangxinxiEntity> wrapper);
   	
   	JianshenfangxinxiView selectView(@Param("ew") Wrapper<JianshenfangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianshenfangxinxiEntity> wrapper);
   	

}

