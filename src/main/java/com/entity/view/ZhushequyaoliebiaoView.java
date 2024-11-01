package com.entity.view;

import com.entity.ZhushequyaoliebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 注射取药列表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
@TableName("zhushequyaoliebiao")
public class ZhushequyaoliebiaoView  extends ZhushequyaoliebiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhushequyaoliebiaoView(){
	}
 
 	public ZhushequyaoliebiaoView(ZhushequyaoliebiaoEntity zhushequyaoliebiaoEntity){
 	try {
			BeanUtils.copyProperties(this, zhushequyaoliebiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
