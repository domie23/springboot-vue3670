package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QicaifenpeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QicaifenpeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QicaifenpeiView;


/**
 * 器材分配
 *
 * @author 
 * @email 
 * @date 2022-05-18 16:39:28
 */
public interface QicaifenpeiService extends IService<QicaifenpeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QicaifenpeiVO> selectListVO(Wrapper<QicaifenpeiEntity> wrapper);
   	
   	QicaifenpeiVO selectVO(@Param("ew") Wrapper<QicaifenpeiEntity> wrapper);
   	
   	List<QicaifenpeiView> selectListView(Wrapper<QicaifenpeiEntity> wrapper);
   	
   	QicaifenpeiView selectView(@Param("ew") Wrapper<QicaifenpeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QicaifenpeiEntity> wrapper);
   	

}

