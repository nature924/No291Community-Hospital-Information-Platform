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
 * 注射取药列表
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
@TableName("zhushequyaoliebiao")
public class ZhushequyaoliebiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhushequyaoliebiaoEntity() {
		
	}
	
	public ZhushequyaoliebiaoEntity(T t) {
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
					
	private String nianling;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 注射药物列表
	 */
					
	private String zhusheyaowuliebiao;
	
	/**
	 * 取药窗口
	 */
					
	private String quyaochuangkou;
	
	/**
	 * 取药状态
	 */
					
	private String quyaozhuangtai;
	
	/**
	 * 管理员账号
	 */
					
	private String guanliyuanzhanghao;
	
	/**
	 * 管理员姓名
	 */
					
	private String guanliyuanxingming;
	
	
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
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
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
	 * 设置：管理员账号
	 */
	public void setGuanliyuanzhanghao(String guanliyuanzhanghao) {
		this.guanliyuanzhanghao = guanliyuanzhanghao;
	}
	/**
	 * 获取：管理员账号
	 */
	public String getGuanliyuanzhanghao() {
		return guanliyuanzhanghao;
	}
	/**
	 * 设置：管理员姓名
	 */
	public void setGuanliyuanxingming(String guanliyuanxingming) {
		this.guanliyuanxingming = guanliyuanxingming;
	}
	/**
	 * 获取：管理员姓名
	 */
	public String getGuanliyuanxingming() {
		return guanliyuanxingming;
	}

}
