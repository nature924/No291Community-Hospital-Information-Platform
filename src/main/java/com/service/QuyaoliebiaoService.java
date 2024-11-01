package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuyaoliebiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QuyaoliebiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QuyaoliebiaoView;


/**
 * 取药列表
 *
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public interface QuyaoliebiaoService extends IService<QuyaoliebiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuyaoliebiaoVO> selectListVO(Wrapper<QuyaoliebiaoEntity> wrapper);
   	
   	QuyaoliebiaoVO selectVO(@Param("ew") Wrapper<QuyaoliebiaoEntity> wrapper);
   	
   	List<QuyaoliebiaoView> selectListView(Wrapper<QuyaoliebiaoEntity> wrapper);
   	
   	QuyaoliebiaoView selectView(@Param("ew") Wrapper<QuyaoliebiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuyaoliebiaoEntity> wrapper);
   	
}

