package com.entity.vo;

import com.entity.GoumaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 购买信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-18 16:39:28
 */
public class GoumaixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 器材名称
	 */
	
	private String qicaimingcheng;
		
	/**
	 * 购买时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date goumaishijian;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 购买价格
	 */
	
	private Float goumaijiage;
		
	/**
	 * 总价
	 */
	
	private Float zongjia;
		
	/**
	 * 购买账单
	 */
	
	private String goumaizhangdan;
				
	
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
	 * 设置：购买时间
	 */
	 
	public void setGoumaishijian(Date goumaishijian) {
		this.goumaishijian = goumaishijian;
	}
	
	/**
	 * 获取：购买时间
	 */
	public Date getGoumaishijian() {
		return goumaishijian;
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
	 * 设置：购买价格
	 */
	 
	public void setGoumaijiage(Float goumaijiage) {
		this.goumaijiage = goumaijiage;
	}
	
	/**
	 * 获取：购买价格
	 */
	public Float getGoumaijiage() {
		return goumaijiage;
	}
				
	
	/**
	 * 设置：总价
	 */
	 
	public void setZongjia(Float zongjia) {
		this.zongjia = zongjia;
	}
	
	/**
	 * 获取：总价
	 */
	public Float getZongjia() {
		return zongjia;
	}
				
	
	/**
	 * 设置：购买账单
	 */
	 
	public void setGoumaizhangdan(String goumaizhangdan) {
		this.goumaizhangdan = goumaizhangdan;
	}
	
	/**
	 * 获取：购买账单
	 */
	public String getGoumaizhangdan() {
		return goumaizhangdan;
	}
			
}
