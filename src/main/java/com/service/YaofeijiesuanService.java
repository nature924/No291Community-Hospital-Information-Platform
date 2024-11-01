package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaofeijiesuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaofeijiesuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaofeijiesuanView;


/**
 * 药费结算
 *
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public interface YaofeijiesuanService extends IService<YaofeijiesuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaofeijiesuanVO> selectListVO(Wrapper<YaofeijiesuanEntity> wrapper);
   	
   	YaofeijiesuanVO selectVO(@Param("ew") Wrapper<YaofeijiesuanEntity> wrapper);
   	
   	List<YaofeijiesuanView> selectListView(Wrapper<YaofeijiesuanEntity> wrapper);
   	
   	YaofeijiesuanView selectView(@Param("ew") Wrapper<YaofeijiesuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaofeijiesuanEntity> wrapper);
   	
}

