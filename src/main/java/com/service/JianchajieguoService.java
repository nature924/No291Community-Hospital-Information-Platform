package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianchajieguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianchajieguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianchajieguoView;


/**
 * 检查结果
 *
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public interface JianchajieguoService extends IService<JianchajieguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianchajieguoVO> selectListVO(Wrapper<JianchajieguoEntity> wrapper);
   	
   	JianchajieguoVO selectVO(@Param("ew") Wrapper<JianchajieguoEntity> wrapper);
   	
   	List<JianchajieguoView> selectListView(Wrapper<JianchajieguoEntity> wrapper);
   	
   	JianchajieguoView selectView(@Param("ew") Wrapper<JianchajieguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianchajieguoEntity> wrapper);
   	
}

