package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QicaifenpeiDao;
import com.entity.QicaifenpeiEntity;
import com.service.QicaifenpeiService;
import com.entity.vo.QicaifenpeiVO;
import com.entity.view.QicaifenpeiView;

@Service("qicaifenpeiService")
public class QicaifenpeiServiceImpl extends ServiceImpl<QicaifenpeiDao, QicaifenpeiEntity> implements QicaifenpeiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QicaifenpeiEntity> page = this.selectPage(
                new Query<QicaifenpeiEntity>(params).getPage(),
                new EntityWrapper<QicaifenpeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QicaifenpeiEntity> wrapper) {
		  Page<QicaifenpeiView> page =new Query<QicaifenpeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QicaifenpeiVO> selectListVO(Wrapper<QicaifenpeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QicaifenpeiVO selectVO(Wrapper<QicaifenpeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QicaifenpeiView> selectListView(Wrapper<QicaifenpeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QicaifenpeiView selectView(Wrapper<QicaifenpeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
