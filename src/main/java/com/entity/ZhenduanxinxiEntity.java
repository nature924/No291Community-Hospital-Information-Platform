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
 * 诊断信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
@TableName("zhenduanxinxi")
public class ZhenduanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhenduanxinxiEntity() {
		
	}
	
	public ZhenduanxinxiEntity(T t) {
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
	 * 患者账号
	 */
					
	private String huanzhezhanghao;
	
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
	 * 是否注射
	 */
					
	private String shifouzhushe;
	
	/**
	 * 注射药物列表
	 */
					
	private String zhusheyaowuliebiao;
	
	/**
	 * 开药名单一
	 */
					
	private String kaiyaomingdanyi;
	
	/**
	 * 开药名单二
	 */
					
	private String kaiyaomingdaner;
	
	/**
	 * 开药名单三
	 */
					
	private String kaiyaomingdansan;
	
	/**
	 * 开药列表
	 */
					
	private String kaiyaoliebiao;
	
	/**
	 * 医生工号
	 */
					
	private String yishenggonghao;
	
	/**
	 * 医生姓名
	 */
					
	private String yishengxingming;
	
	
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
	 * 设置：患者账号
	 */
	public void setHuanzhezhanghao(String huanzhezhanghao) {
		this.huanzhezhanghao = huanzhezhanghao;
	}
	/**
	 * 获取：患者账号
	 */
	public String getHuanzhezhanghao() {
		return huanzhezhanghao;
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
	 * 设置：是否注射
	 */
	public void setShifouzhushe(String shifouzhushe) {
		this.shifouzhushe = shifouzhushe;
	}
	/**
	 * 获取：是否注射
	 */
	public String getShifouzhushe() {
		return shifouzhushe;
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
	 * 设置：开药名单一
	 */
	public void setKaiyaomingdanyi(String kaiyaomingdanyi) {
		this.kaiyaomingdanyi = kaiyaomingdanyi;
	}
	/**
	 * 获取：开药名单一
	 */
	public String getKaiyaomingdanyi() {
		return kaiyaomingdanyi;
	}
	/**
	 * 设置：开药名单二
	 */
	public void setKaiyaomingdaner(String kaiyaomingdaner) {
		this.kaiyaomingdaner = kaiyaomingdaner;
	}
	/**
	 * 获取：开药名单二
	 */
	public String getKaiyaomingdaner() {
		return kaiyaomingdaner;
	}
	/**
	 * 设置：开药名单三
	 */
	public void setKaiyaomingdansan(String kaiyaomingdansan) {
		this.kaiyaomingdansan = kaiyaomingdansan;
	}
	/**
	 * 获取：开药名单三
	 */
	public String getKaiyaomingdansan() {
		return kaiyaomingdansan;
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
	 * 设置：医生工号
	 */
	public void setYishenggonghao(String yishenggonghao) {
		this.yishenggonghao = yishenggonghao;
	}
	/**
	 * 获取：医生工号
	 */
	public String getYishenggonghao() {
		return yishenggonghao;
	}
	/**
	 * 设置：医生姓名
	 */
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}

}
