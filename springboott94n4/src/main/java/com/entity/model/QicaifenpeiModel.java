package com.entity.model;

import com.entity.QicaifenpeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 器材分配
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-18 16:39:28
 */
public class QicaifenpeiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
