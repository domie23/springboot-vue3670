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
 * 维修信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-18 16:39:28
 */
@TableName("weixiuxinxi")
public class WeixiuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WeixiuxinxiEntity() {
		
	}
	
	public WeixiuxinxiEntity(T t) {
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
	 * 维修编号
	 */
					
	private String weixiubianhao;
	
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
	 * 设置：维修编号
	 */
	public void setWeixiubianhao(String weixiubianhao) {
		this.weixiubianhao = weixiubianhao;
	}
	/**
	 * 获取：维修编号
	 */
	public String getWeixiubianhao() {
		return weixiubianhao;
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
