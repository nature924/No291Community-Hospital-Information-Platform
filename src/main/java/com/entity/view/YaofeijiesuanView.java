package com.entity.view;

import com.entity.YaofeijiesuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 药费结算
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
@TableName("yaofeijiesuan")
public class YaofeijiesuanView  extends YaofeijiesuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YaofeijiesuanView(){
	}
 
 	public YaofeijiesuanView(YaofeijiesuanEntity yaofeijiesuanEntity){
 	try {
			BeanUtils.copyProperties(this, yaofeijiesuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
