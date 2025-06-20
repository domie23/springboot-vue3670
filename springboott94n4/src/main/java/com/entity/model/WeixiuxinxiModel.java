package com.entity.model;

import com.entity.WeixiuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 维修信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-18 16:39:28
 */
public class WeixiuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 器材名称
	 */
	
	private String qicaimingcheng;
		
	/**
	 * 维修时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date weixiushijian;
		
	/**
	 * 维修备注
	 */
	
	private String weixiubeizhu;
		
	/**
	 * 维修人
	 */
	
	private String weixiuren;
		
	/**
	 * 维修电话
	 */
	
	private String weixiudianhua;
				
	
	/**
	 * 设置：器材名称
	 */
	 
	public void setQicaimingcheng(String qicaimingcheng) {
		this.qicaimingcheng = qicaimingcheng;
	}
	
	/**
	 * 获取：器材名称
	 */
	public String getQicaimingcheng() {
		return qicaimingcheng;
	}
				
	
	/**
	 * 设置：维修时间
	 */
	 
	public void setWeixiushijian(Date weixiushijian) {
		this.weixiushijian = weixiushijian;
	}
	
	/**
	 * 获取：维修时间
	 */
	public Date getWeixiushijian() {
		return weixiushijian;
	}
				
	
	/**
	 * 设置：维修备注
	 */
	 
	public void setWeixiubeizhu(String weixiubeizhu) {
		this.weixiubeizhu = weixiubeizhu;
	}
	
	/**
	 * 获取：维修备注
	 */
	public String getWeixiubeizhu() {
		return weixiubeizhu;
	}
				
	
	/**
	 * 设置：维修人
	 */
	 
	public void setWeixiuren(String weixiuren) {
		this.weixiuren = weixiuren;
	}
	
	/**
	 * 获取：维修人
	 */
	public String getWeixiuren() {
		return weixiuren;
	}
				
	
	/**
	 * 设置：维修电话
	 */
	 
	public void setWeixiudianhua(String weixiudianhua) {
		this.weixiudianhua = weixiudianhua;
	}
	
	/**
	 * 获取：维修电话
	 */
	public String getWeixiudianhua() {
		return weixiudianhua;
	}
			
}
