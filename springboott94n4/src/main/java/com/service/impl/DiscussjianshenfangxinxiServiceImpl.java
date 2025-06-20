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


import com.dao.DiscussjianshenfangxinxiDao;
import com.entity.DiscussjianshenfangxinxiEntity;
import com.service.DiscussjianshenfangxinxiService;
import com.entity.vo.DiscussjianshenfangxinxiVO;
import com.entity.view.DiscussjianshenfangxinxiView;

@Service("discussjianshenfangxinxiService")
public class DiscussjianshenfangxinxiServiceImpl extends ServiceImpl<DiscussjianshenfangxinxiDao, DiscussjianshenfangxinxiEntity> implements DiscussjianshenfangxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjianshenfangxinxiEntity> page = this.selectPage(
                new Query<DiscussjianshenfangxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussjianshenfangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjianshenfangxinxiEntity> wrapper) {
		  Page<DiscussjianshenfangxinxiView> page =new Query<DiscussjianshenfangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjianshenfangxinxiVO> selectListVO(Wrapper<DiscussjianshenfangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjianshenfangxinxiVO selectVO(Wrapper<DiscussjianshenfangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjianshenfangxinxiView> selectListView(Wrapper<DiscussjianshenfangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjianshenfangxinxiView selectView(Wrapper<DiscussjianshenfangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
