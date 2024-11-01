package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaopinguanliyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaopinguanliyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaopinguanliyuanView;


/**
 * 药品管理员
 *
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public interface YaopinguanliyuanService extends IService<YaopinguanliyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaopinguanliyuanVO> selectListVO(Wrapper<YaopinguanliyuanEntity> wrapper);
   	
   	YaopinguanliyuanVO selectVO(@Param("ew") Wrapper<YaopinguanliyuanEntity> wrapper);
   	
   	List<YaopinguanliyuanView> selectListView(Wrapper<YaopinguanliyuanEntity> wrapper);
   	
   	YaopinguanliyuanView selectView(@Param("ew") Wrapper<YaopinguanliyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaopinguanliyuanEntity> wrapper);
   	
}

