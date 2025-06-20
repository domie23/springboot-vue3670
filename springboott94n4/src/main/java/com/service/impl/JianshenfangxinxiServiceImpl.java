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


import com.dao.JianshenfangxinxiDao;
import com.entity.JianshenfangxinxiEntity;
import com.service.JianshenfangxinxiService;
import com.entity.vo.JianshenfangxinxiVO;
import com.entity.view.JianshenfangxinxiView;

@Service("jianshenfangxinxiService")
public class JianshenfangxinxiServiceImpl extends ServiceImpl<JianshenfangxinxiDao, JianshenfangxinxiEntity> implements JianshenfangxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianshenfangxinxiEntity> page = this.selectPage(
                new Query<JianshenfangxinxiEntity>(params).getPage(),
                new EntityWrapper<JianshenfangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianshenfangxinxiEntity> wrapper) {
		  Page<JianshenfangxinxiView> page =new Query<JianshenfangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianshenfangxinxiVO> selectListVO(Wrapper<JianshenfangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianshenfangxinxiVO selectVO(Wrapper<JianshenfangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianshenfangxinxiView> selectListView(Wrapper<JianshenfangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianshenfangxinxiView selectView(Wrapper<JianshenfangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
