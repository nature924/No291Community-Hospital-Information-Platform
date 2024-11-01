package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaijianchaliebiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaijianchaliebiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaijianchaliebiaoView;


/**
 * 待检查列表
 *
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public interface DaijianchaliebiaoService extends IService<DaijianchaliebiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaijianchaliebiaoVO> selectListVO(Wrapper<DaijianchaliebiaoEntity> wrapper);
   	
   	DaijianchaliebiaoVO selectVO(@Param("ew") Wrapper<DaijianchaliebiaoEntity> wrapper);
   	
   	List<DaijianchaliebiaoView> selectListView(Wrapper<DaijianchaliebiaoEntity> wrapper);
   	
   	DaijianchaliebiaoView selectView(@Param("ew") Wrapper<DaijianchaliebiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaijianchaliebiaoEntity> wrapper);
   	
}

