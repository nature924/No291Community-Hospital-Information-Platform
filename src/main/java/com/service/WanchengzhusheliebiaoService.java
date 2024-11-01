package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WanchengzhusheliebiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WanchengzhusheliebiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WanchengzhusheliebiaoView;


/**
 * 完成注射列表
 *
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public interface WanchengzhusheliebiaoService extends IService<WanchengzhusheliebiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WanchengzhusheliebiaoVO> selectListVO(Wrapper<WanchengzhusheliebiaoEntity> wrapper);
   	
   	WanchengzhusheliebiaoVO selectVO(@Param("ew") Wrapper<WanchengzhusheliebiaoEntity> wrapper);
   	
   	List<WanchengzhusheliebiaoView> selectListView(Wrapper<WanchengzhusheliebiaoEntity> wrapper);
   	
   	WanchengzhusheliebiaoView selectView(@Param("ew") Wrapper<WanchengzhusheliebiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WanchengzhusheliebiaoEntity> wrapper);
   	
}

