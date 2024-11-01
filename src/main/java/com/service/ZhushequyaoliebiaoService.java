package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhushequyaoliebiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhushequyaoliebiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhushequyaoliebiaoView;


/**
 * 注射取药列表
 *
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public interface ZhushequyaoliebiaoService extends IService<ZhushequyaoliebiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhushequyaoliebiaoVO> selectListVO(Wrapper<ZhushequyaoliebiaoEntity> wrapper);
   	
   	ZhushequyaoliebiaoVO selectVO(@Param("ew") Wrapper<ZhushequyaoliebiaoEntity> wrapper);
   	
   	List<ZhushequyaoliebiaoView> selectListView(Wrapper<ZhushequyaoliebiaoEntity> wrapper);
   	
   	ZhushequyaoliebiaoView selectView(@Param("ew") Wrapper<ZhushequyaoliebiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhushequyaoliebiaoEntity> wrapper);
   	
}

