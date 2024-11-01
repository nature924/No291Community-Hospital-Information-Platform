package com.entity.vo;

import com.entity.WanchengzhusheliebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 完成注射列表
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public class WanchengzhusheliebiaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private Integer nianling;
		
	/**
	 * 注射药物列表
	 */
	
	private String zhusheyaowuliebiao;
		
	/**
	 * 注射时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zhusheshijian;
		
	/**
	 * 护士工号
	 */
	
	private String hushigonghao;
		
	/**
	 * 护士姓名
	 */
	
	private String hushixingming;
				
	
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
	 * 设置：注射药物列表
	 */
	 
	public void setZhusheyaowuliebiao(String zhusheyaowuliebiao) {
		this.zhusheyaowuliebiao = zhusheyaowuliebiao;
	}
	
	/**
	 * 获取：注射药物列表
	 */
	public String getZhusheyaowuliebiao() {
		return zhusheyaowuliebiao;
	}
				
	
	/**
	 * 设置：注射时间
	 */
	 
	public void setZhusheshijian(Date zhusheshijian) {
		this.zhusheshijian = zhusheshijian;
	}
	
	/**
	 * 获取：注射时间
	 */
	public Date getZhusheshijian() {
		return zhusheshijian;
	}
				
	
	/**
	 * 设置：护士工号
	 */
	 
	public void setHushigonghao(String hushigonghao) {
		this.hushigonghao = hushigonghao;
	}
	
	/**
	 * 获取：护士工号
	 */
	public String getHushigonghao() {
		return hushigonghao;
	}
				
	
	/**
	 * 设置：护士姓名
	 */
	 
	public void setHushixingming(String hushixingming) {
		this.hushixingming = hushixingming;
	}
	
	/**
	 * 获取：护士姓名
	 */
	public String getHushixingming() {
		return hushixingming;
	}
			
}
