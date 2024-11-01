package com.entity.view;

import com.entity.WanchengzhusheliebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 完成注射列表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
@TableName("wanchengzhusheliebiao")
public class WanchengzhusheliebiaoView  extends WanchengzhusheliebiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WanchengzhusheliebiaoView(){
	}
 
 	public WanchengzhusheliebiaoView(WanchengzhusheliebiaoEntity wanchengzhusheliebiaoEntity){
 	try {
			BeanUtils.copyProperties(this, wanchengzhusheliebiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
