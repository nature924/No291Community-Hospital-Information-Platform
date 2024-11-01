package com.entity.model;

import com.entity.ZhushequyaoliebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 注射取药列表
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public class ZhushequyaoliebiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
