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
 * 器材信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-18 16:39:28
 */
@TableName("qicaixinxi")
public class QicaixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QicaixinxiEntity() {
		
	}
	
	public QicaixinxiEntity(T t) {
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
	 * 器材编号
	 */
					
	private String qicaibianhao;
	
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
	 * 设置：器材编号
	 */
	public void setQicaibianhao(String qicaibianhao) {
		this.qicaibianhao = qicaibianhao;
	}
	/**
	 * 获取：器材编号
	 */
	public String getQicaibianhao() {
		return qicaibianhao;
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
