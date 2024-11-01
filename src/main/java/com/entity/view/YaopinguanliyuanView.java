package com.entity.view;

import com.entity.YaopinguanliyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 药品管理员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
@TableName("yaopinguanliyuan")
public class YaopinguanliyuanView  extends YaopinguanliyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YaopinguanliyuanView(){
	}
 
 	public YaopinguanliyuanView(YaopinguanliyuanEntity yaopinguanliyuanEntity){
 	try {
			BeanUtils.copyProperties(this, yaopinguanliyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
