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
 * 完成注射列表
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
@TableName("wanchengzhusheliebiao")
public class WanchengzhusheliebiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WanchengzhusheliebiaoEntity() {
		
	}
	
	public WanchengzhusheliebiaoEntity(T t) {
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
