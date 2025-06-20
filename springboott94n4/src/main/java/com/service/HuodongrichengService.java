package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuodongrichengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuodongrichengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongrichengView;


/**
 * 活动日程
 *
 * @author 
 * @email 
 * @date 2022-05-18 16:39:28
 */
public interface HuodongrichengService extends IService<HuodongrichengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuodongrichengVO> selectListVO(Wrapper<HuodongrichengEntity> wrapper);
   	
   	HuodongrichengVO selectVO(@Param("ew") Wrapper<HuodongrichengEntity> wrapper);
   	
   	List<HuodongrichengView> selectListView(Wrapper<HuodongrichengEntity> wrapper);
   	
   	HuodongrichengView selectView(@Param("ew") Wrapper<HuodongrichengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuodongrichengEntity> wrapper);
   	

}

