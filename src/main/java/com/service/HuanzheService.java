package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuanzheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuanzheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuanzheView;


/**
 * 患者
 *
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public interface HuanzheService extends IService<HuanzheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuanzheVO> selectListVO(Wrapper<HuanzheEntity> wrapper);
   	
   	HuanzheVO selectVO(@Param("ew") Wrapper<HuanzheEntity> wrapper);
   	
   	List<HuanzheView> selectListView(Wrapper<HuanzheEntity> wrapper);
   	
   	HuanzheView selectView(@Param("ew") Wrapper<HuanzheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuanzheEntity> wrapper);
   	
}

