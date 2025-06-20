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


import com.dao.KechengquxiaoDao;
import com.entity.KechengquxiaoEntity;
import com.service.KechengquxiaoService;
import com.entity.vo.KechengquxiaoVO;
import com.entity.view.KechengquxiaoView;

@Service("kechengquxiaoService")
public class KechengquxiaoServiceImpl extends ServiceImpl<KechengquxiaoDao, KechengquxiaoEntity> implements KechengquxiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengquxiaoEntity> page = this.selectPage(
                new Query<KechengquxiaoEntity>(params).getPage(),
                new EntityWrapper<KechengquxiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengquxiaoEntity> wrapper) {
		  Page<KechengquxiaoView> page =new Query<KechengquxiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengquxiaoVO> selectListVO(Wrapper<KechengquxiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengquxiaoVO selectVO(Wrapper<KechengquxiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengquxiaoView> selectListView(Wrapper<KechengquxiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengquxiaoView selectView(Wrapper<KechengquxiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
