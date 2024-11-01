package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhusheliebiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhusheliebiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhusheliebiaoView;


/**
 * 注射列表
 *
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public interface ZhusheliebiaoService extends IService<ZhusheliebiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhusheliebiaoVO> selectListVO(Wrapper<ZhusheliebiaoEntity> wrapper);
   	
   	ZhusheliebiaoVO selectVO(@Param("ew") Wrapper<ZhusheliebiaoEntity> wrapper);
   	
   	List<ZhusheliebiaoView> selectListView(Wrapper<ZhusheliebiaoEntity> wrapper);
   	
   	ZhusheliebiaoView selectView(@Param("ew") Wrapper<ZhusheliebiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhusheliebiaoEntity> wrapper);
   	
}

