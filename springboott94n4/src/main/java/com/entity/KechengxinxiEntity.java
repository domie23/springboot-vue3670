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
 * 课程信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-18 16:39:28
 */
@TableName("kechengxinxi")
public class KechengxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KechengxinxiEntity() {
		
	}
	
	public KechengxinxiEntity(T t) {
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
	 * 课程编号
	 */
					
	private String kechengbianhao;
	
	/**
	 * 课程标题
	 */
					
	private String kechengbiaoti;
	
	/**
	 * 课程分类
	 */
					
	private String kechengfenlei;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 课程时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date kechengshijian;
	
	/**
	 * 课时
	 */
					
	private String keshi;
	
	/**
	 * 人数
	 */
					
	private Integer renshu;
	
	/**
	 * 价格
	 */
					
	private Float jiage;
	
	/**
	 * 所需器材
	 */
					
	private String suoxuqicai;
	
	/**
	 * 课程详情
	 */
					
	private String kechengxiangqing;
	
	/**
	 * 员工号
	 */
					
	private String yuangonghao;
	
	/**
	 * 教练姓名
	 */
					
	private String jiaolianxingming;
	
	/**
	 * 开课状态
	 */
					
	private String kaikezhuangtai;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
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
	 * 设置：课程编号
	 */
	public void setKechengbianhao(String kechengbianhao) {
		this.kechengbianhao = kechengbianhao;
	}
	/**
	 * 获取：课程编号
	 */
	public String getKechengbianhao() {
		return kechengbianhao;
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
	 * 设置：课程时间
	 */
	public void setKechengshijian(Date kechengshijian) {
		this.kechengshijian = kechengshijian;
	}
	/**
	 * 获取：课程时间
	 */
	public Date getKechengshijian() {
		return kechengshijian;
	}
	/**
	 * 设置：课时
	 */
	public void setKeshi(String keshi) {
		this.keshi = keshi;
	}
	/**
	 * 获取：课时
	 */
	public String getKeshi() {
		return keshi;
	}
	/**
	 * 设置：人数
	 */
	public void setRenshu(Integer renshu) {
		this.renshu = renshu;
	}
	/**
	 * 获取：人数
	 */
	public Integer getRenshu() {
		return renshu;
	}
	/**
	 * 设置：价格
	 */
	public void setJiage(Float jiage) {
		this.jiage = jiage;
	}
	/**
	 * 获取：价格
	 */
	public Float getJiage() {
		return jiage;
	}
	/**
	 * 设置：所需器材
	 */
	public void setSuoxuqicai(String suoxuqicai) {
		this.suoxuqicai = suoxuqicai;
	}
	/**
	 * 获取：所需器材
	 */
	public String getSuoxuqicai() {
		return suoxuqicai;
	}
	/**
	 * 设置：课程详情
	 */
	public void setKechengxiangqing(String kechengxiangqing) {
		this.kechengxiangqing = kechengxiangqing;
	}
	/**
	 * 获取：课程详情
	 */
	public String getKechengxiangqing() {
		return kechengxiangqing;
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
	 * 设置：开课状态
	 */
	public void setKaikezhuangtai(String kaikezhuangtai) {
		this.kaikezhuangtai = kaikezhuangtai;
	}
	/**
	 * 获取：开课状态
	 */
	public String getKaikezhuangtai() {
		return kaikezhuangtai;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
