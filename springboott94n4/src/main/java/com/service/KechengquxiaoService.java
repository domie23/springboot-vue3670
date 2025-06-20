package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengquxiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengquxiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengquxiaoView;


/**
 * 课程取消
 *
 * @author 
 * @email 
 * @date 2022-05-18 16:39:28
 */
public interface KechengquxiaoService extends IService<KechengquxiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengquxiaoVO> selectListVO(Wrapper<KechengquxiaoEntity> wrapper);
   	
   	KechengquxiaoVO selectVO(@Param("ew") Wrapper<KechengquxiaoEntity> wrapper);
   	
   	List<KechengquxiaoView> selectListView(Wrapper<KechengquxiaoEntity> wrapper);
   	
   	KechengquxiaoView selectView(@Param("ew") Wrapper<KechengquxiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengquxiaoEntity> wrapper);
   	

}

