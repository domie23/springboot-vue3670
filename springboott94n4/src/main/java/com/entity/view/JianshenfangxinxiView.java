package com.entity.view;

import com.entity.JianshenfangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健身房信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-18 16:39:28
 */
@TableName("jianshenfangxinxi")
public class JianshenfangxinxiView  extends JianshenfangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianshenfangxinxiView(){
	}
 
 	public JianshenfangxinxiView(JianshenfangxinxiEntity jianshenfangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jianshenfangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
