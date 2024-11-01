package com.dao;

import com.entity.ZhushequyaoliebiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhushequyaoliebiaoVO;
import com.entity.view.ZhushequyaoliebiaoView;


/**
 * 注射取药列表
 * 
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public interface ZhushequyaoliebiaoDao extends BaseMapper<ZhushequyaoliebiaoEntity> {
	
	List<ZhushequyaoliebiaoVO> selectListVO(@Param("ew") Wrapper<ZhushequyaoliebiaoEntity> wrapper);
	
	ZhushequyaoliebiaoVO selectVO(@Param("ew") Wrapper<ZhushequyaoliebiaoEntity> wrapper);
	
	List<ZhushequyaoliebiaoView> selectListView(@Param("ew") Wrapper<ZhushequyaoliebiaoEntity> wrapper);

	List<ZhushequyaoliebiaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZhushequyaoliebiaoEntity> wrapper);
	
	ZhushequyaoliebiaoView selectView(@Param("ew") Wrapper<ZhushequyaoliebiaoEntity> wrapper);
	
}
