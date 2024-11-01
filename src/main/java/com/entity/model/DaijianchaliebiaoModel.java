package com.entity.model;

import com.entity.DaijianchaliebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 待检查列表
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public class DaijianchaliebiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 患者姓名
	 */
	
	private String huanzhexingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private Integer nianling;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 检查项目
	 */
	
	private String jianchaxiangmu;
		
	/**
	 * 检查类型
	 */
	
	private String jianchaleixing;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：患者姓名
	 */
	 
	public void setHuanzhexingming(String huanzhexingming) {
		this.huanzhexingming = huanzhexingming;
	}
	
	/**
	 * 获取：患者姓名
	 */
	public String getHuanzhexingming() {
		return huanzhexingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：检查项目
	 */
	 
	public void setJianchaxiangmu(String jianchaxiangmu) {
		this.jianchaxiangmu = jianchaxiangmu;
	}
	
	/**
	 * 获取：检查项目
	 */
	public String getJianchaxiangmu() {
		return jianchaxiangmu;
	}
				
	
	/**
	 * 设置：检查类型
	 */
	 
	public void setJianchaleixing(String jianchaleixing) {
		this.jianchaleixing = jianchaleixing;
	}
	
	/**
	 * 获取：检查类型
	 */
	public String getJianchaleixing() {
		return jianchaleixing;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
