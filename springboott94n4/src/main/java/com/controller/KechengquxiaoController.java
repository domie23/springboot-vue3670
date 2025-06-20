package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.KechengquxiaoEntity;
import com.entity.view.KechengquxiaoView;

import com.service.KechengquxiaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 课程取消
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-18 16:39:28
 */
@RestController
@RequestMapping("/kechengquxiao")
public class KechengquxiaoController {
    @Autowired
    private KechengquxiaoService kechengquxiaoService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KechengquxiaoEntity kechengquxiao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			kechengquxiao.setYonghudianhua((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaolian")) {
			kechengquxiao.setYuangonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<KechengquxiaoEntity> ew = new EntityWrapper<KechengquxiaoEntity>();
		PageUtils page = kechengquxiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengquxiao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KechengquxiaoEntity kechengquxiao, 
		HttpServletRequest request){
        EntityWrapper<KechengquxiaoEntity> ew = new EntityWrapper<KechengquxiaoEntity>();
		PageUtils page = kechengquxiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengquxiao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KechengquxiaoEntity kechengquxiao){
       	EntityWrapper<KechengquxiaoEntity> ew = new EntityWrapper<KechengquxiaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kechengquxiao, "kechengquxiao")); 
        return R.ok().put("data", kechengquxiaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KechengquxiaoEntity kechengquxiao){
        EntityWrapper< KechengquxiaoEntity> ew = new EntityWrapper< KechengquxiaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kechengquxiao, "kechengquxiao")); 
		KechengquxiaoView kechengquxiaoView =  kechengquxiaoService.selectView(ew);
		return R.ok("查询课程取消成功").put("data", kechengquxiaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KechengquxiaoEntity kechengquxiao = kechengquxiaoService.selectById(id);
        return R.ok().put("data", kechengquxiao);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KechengquxiaoEntity kechengquxiao = kechengquxiaoService.selectById(id);
        return R.ok().put("data", kechengquxiao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KechengquxiaoEntity kechengquxiao, HttpServletRequest request){
    	kechengquxiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kechengquxiao);
        kechengquxiaoService.insert(kechengquxiao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KechengquxiaoEntity kechengquxiao, HttpServletRequest request){
    	kechengquxiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kechengquxiao);
        kechengquxiaoService.insert(kechengquxiao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KechengquxiaoEntity kechengquxiao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kechengquxiao);
        kechengquxiaoService.updateById(kechengquxiao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kechengquxiaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<KechengquxiaoEntity> wrapper = new EntityWrapper<KechengquxiaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghudianhua", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaolian")) {
			wrapper.eq("yuangonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = kechengquxiaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
