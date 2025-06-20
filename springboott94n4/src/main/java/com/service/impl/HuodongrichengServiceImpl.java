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


import com.dao.HuodongrichengDao;
import com.entity.HuodongrichengEntity;
import com.service.HuodongrichengService;
import com.entity.vo.HuodongrichengVO;
import com.entity.view.HuodongrichengView;

@Service("huodongrichengService")
public class HuodongrichengServiceImpl extends ServiceImpl<HuodongrichengDao, HuodongrichengEntity> implements HuodongrichengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuodongrichengEntity> page = this.selectPage(
                new Query<HuodongrichengEntity>(params).getPage(),
                new EntityWrapper<HuodongrichengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuodongrichengEntity> wrapper) {
		  Page<HuodongrichengView> page =new Query<HuodongrichengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuodongrichengVO> selectListVO(Wrapper<HuodongrichengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuodongrichengVO selectVO(Wrapper<HuodongrichengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuodongrichengView> selectListView(Wrapper<HuodongrichengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuodongrichengView selectView(Wrapper<HuodongrichengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
