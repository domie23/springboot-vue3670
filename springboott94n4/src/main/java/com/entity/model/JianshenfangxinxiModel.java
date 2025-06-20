package com.entity.model;

import com.entity.JianshenfangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健身房信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-18 16:39:28
 */
public class JianshenfangxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 健身房名称
	 */
	
	private String jianshenfangmingcheng;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 健身项目
	 */
	
	private String jianshenxiangmu;
		
	/**
	 * 位置
	 */
	
	private String weizhi;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 健身房简介
	 */
	
	private String jianshenfangjianjie;
				
	
	/**
	 * 设置：健身房名称
	 */
	 
	public void setJianshenfangmingcheng(String jianshenfangmingcheng) {
		this.jianshenfangmingcheng = jianshenfangmingcheng;
	}
	
	/**
	 * 获取：健身房名称
	 */
	public String getJianshenfangmingcheng() {
		return jianshenfangmingcheng;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：健身项目
	 */
	 
	public void setJianshenxiangmu(String jianshenxiangmu) {
		this.jianshenxiangmu = jianshenxiangmu;
	}
	
	/**
	 * 获取：健身项目
	 */
	public String getJianshenxiangmu() {
		return jianshenxiangmu;
	}
				
	
	/**
	 * 设置：位置
	 */
	 
	public void setWeizhi(String weizhi) {
		this.weizhi = weizhi;
	}
	
	/**
	 * 获取：位置
	 */
	public String getWeizhi() {
		return weizhi;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：健身房简介
	 */
	 
	public void setJianshenfangjianjie(String jianshenfangjianjie) {
		this.jianshenfangjianjie = jianshenfangjianjie;
	}
	
	/**
	 * 获取：健身房简介
	 */
	public String getJianshenfangjianjie() {
		return jianshenfangjianjie;
	}
			
}
