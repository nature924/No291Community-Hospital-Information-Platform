package com.entity.model;

import com.entity.QuyaoliebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 取药列表
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public class QuyaoliebiaoModel  implements Serializable {
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
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 诊断结果
	 */
	
	private String zhenduanjieguo;
		
	/**
	 * 开药列表
	 */
	
	private String kaiyaoliebiao;
		
	/**
	 * 取药窗口
	 */
	
	private String quyaochuangkou;
		
	/**
	 * 取药状态
	 */
	
	private String quyaozhuangtai;
		
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
	 * 设置：诊断结果
	 */
	 
	public void setZhenduanjieguo(String zhenduanjieguo) {
		this.zhenduanjieguo = zhenduanjieguo;
	}
	
	/**
	 * 获取：诊断结果
	 */
	public String getZhenduanjieguo() {
		return zhenduanjieguo;
	}
				
	
	/**
	 * 设置：开药列表
	 */
	 
	public void setKaiyaoliebiao(String kaiyaoliebiao) {
		this.kaiyaoliebiao = kaiyaoliebiao;
	}
	
	/**
	 * 获取：开药列表
	 */
	public String getKaiyaoliebiao() {
		return kaiyaoliebiao;
	}
				
	
	/**
	 * 设置：取药窗口
	 */
	 
	public void setQuyaochuangkou(String quyaochuangkou) {
		this.quyaochuangkou = quyaochuangkou;
	}
	
	/**
	 * 获取：取药窗口
	 */
	public String getQuyaochuangkou() {
		return quyaochuangkou;
	}
				
	
	/**
	 * 设置：取药状态
	 */
	 
	public void setQuyaozhuangtai(String quyaozhuangtai) {
		this.quyaozhuangtai = quyaozhuangtai;
	}
	
	/**
	 * 获取：取药状态
	 */
	public String getQuyaozhuangtai() {
		return quyaozhuangtai;
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
