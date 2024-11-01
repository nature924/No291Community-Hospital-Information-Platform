package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaopinjinjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaopinjinjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaopinjinjiaView;


/**
 * 药品进价
 *
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public interface YaopinjinjiaService extends IService<YaopinjinjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaopinjinjiaVO> selectListVO(Wrapper<YaopinjinjiaEntity> wrapper);
   	
   	YaopinjinjiaVO selectVO(@Param("ew") Wrapper<YaopinjinjiaEntity> wrapper);
   	
   	List<YaopinjinjiaView> selectListView(Wrapper<YaopinjinjiaEntity> wrapper);
   	
   	YaopinjinjiaView selectView(@Param("ew") Wrapper<YaopinjinjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaopinjinjiaEntity> wrapper);
   	
}

