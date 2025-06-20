package com.entity.model;

import com.entity.QicaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 器材信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-18 16:39:28
 */
public class QicaixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 器材名称
	 */
	
	private String qicaimingcheng;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 器材用途
	 */
	
	private String qicaiyongtu;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 器材详情
	 */
	
	private String qicaixiangqing;
				
	
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
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：器材用途
	 */
	 
	public void setQicaiyongtu(String qicaiyongtu) {
		this.qicaiyongtu = qicaiyongtu;
	}
	
	/**
	 * 获取：器材用途
	 */
	public String getQicaiyongtu() {
		return qicaiyongtu;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：器材详情
	 */
	 
	public void setQicaixiangqing(String qicaixiangqing) {
		this.qicaixiangqing = qicaixiangqing;
	}
	
	/**
	 * 获取：器材详情
	 */
	public String getQicaixiangqing() {
		return qicaixiangqing;
	}
			
}
