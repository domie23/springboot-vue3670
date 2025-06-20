package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 购买信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-18 16:39:28
 */
@TableName("goumaixinxi")
public class GoumaixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GoumaixinxiEntity() {
		
	}
	
	public GoumaixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 购买编号
	 */
					
	private String goumaibianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：购买编号
	 */
	public void setGoumaibianhao(String goumaibianhao) {
		this.goumaibianhao = goumaibianhao;
	}
	/**
	 * 获取：购买编号
	 */
	public String getGoumaibianhao() {
		return goumaibianhao;
	}
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
