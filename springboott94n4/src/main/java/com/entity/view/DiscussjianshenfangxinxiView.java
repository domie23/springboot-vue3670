package com.entity.view;

import com.entity.DiscussjianshenfangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健身房信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-18 16:39:29
 */
@TableName("discussjianshenfangxinxi")
public class DiscussjianshenfangxinxiView  extends DiscussjianshenfangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjianshenfangxinxiView(){
	}
 
 	public DiscussjianshenfangxinxiView(DiscussjianshenfangxinxiEntity discussjianshenfangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussjianshenfangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
