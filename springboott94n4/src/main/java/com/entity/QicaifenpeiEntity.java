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
 * 器材分配
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-18 16:39:28
 */
@TableName("qicaifenpei")
public class QicaifenpeiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QicaifenpeiEntity() {
		
	}
	
	public QicaifenpeiEntity(T t) {
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
	 * 分配编号
	 */
					
	private String fenpeibianhao;
	
	/**
	 * 器材名称
	 */
					
	private String qicaimingcheng;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 分配时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fenpeishijian;
	
	/**
	 * 课程标题
	 */
					
	private String kechengbiaoti;
	
	/**
	 * 课程分类
	 */
					
	private String kechengfenlei;
	
	/**
	 * 员工号
	 */
					
	private String yuangonghao;
	
	/**
	 * 教练姓名
	 */
					
	private String jiaolianxingming;
	
	/**
	 * 分配详情
	 */
					
	private String fenpeixiangqing;
	
	
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
	 * 设置：分配编号
	 */
	public void setFenpeibianhao(String fenpeibianhao) {
		this.fenpeibianhao = fenpeibianhao;
	}
	/**
	 * 获取：分配编号
	 */
	public String getFenpeibianhao() {
		return fenpeibianhao;
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
	 * 设置：分配时间
	 */
	public void setFenpeishijian(Date fenpeishijian) {
		this.fenpeishijian = fenpeishijian;
	}
	/**
	 * 获取：分配时间
	 */
	public Date getFenpeishijian() {
		return fenpeishijian;
	}
	/**
	 * 设置：课程标题
	 */
	public void setKechengbiaoti(String kechengbiaoti) {
		this.kechengbiaoti = kechengbiaoti;
	}
	/**
	 * 获取：课程标题
	 */
	public String getKechengbiaoti() {
		return kechengbiaoti;
	}
	/**
	 * 设置：课程分类
	 */
	public void setKechengfenlei(String kechengfenlei) {
		this.kechengfenlei = kechengfenlei;
	}
	/**
	 * 获取：课程分类
	 */
	public String getKechengfenlei() {
		return kechengfenlei;
	}
	/**
	 * 设置：员工号
	 */
	public void setYuangonghao(String yuangonghao) {
		this.yuangonghao = yuangonghao;
	}
	/**
	 * 获取：员工号
	 */
	public String getYuangonghao() {
		return yuangonghao;
	}
	/**
	 * 设置：教练姓名
	 */
	public void setJiaolianxingming(String jiaolianxingming) {
		this.jiaolianxingming = jiaolianxingming;
	}
	/**
	 * 获取：教练姓名
	 */
	public String getJiaolianxingming() {
		return jiaolianxingming;
	}
	/**
	 * 设置：分配详情
	 */
	public void setFenpeixiangqing(String fenpeixiangqing) {
		this.fenpeixiangqing = fenpeixiangqing;
	}
	/**
	 * 获取：分配详情
	 */
	public String getFenpeixiangqing() {
		return fenpeixiangqing;
	}

}
