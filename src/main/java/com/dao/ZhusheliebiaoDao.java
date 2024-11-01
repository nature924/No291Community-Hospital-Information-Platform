package com.dao;

import com.entity.ZhusheliebiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhusheliebiaoVO;
import com.entity.view.ZhusheliebiaoView;


/**
 * 注射列表
 * 
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public interface ZhusheliebiaoDao extends BaseMapper<ZhusheliebiaoEntity> {
	
	List<ZhusheliebiaoVO> selectListVO(@Param("ew") Wrapper<ZhusheliebiaoEntity> wrapper);
	
	ZhusheliebiaoVO selectVO(@Param("ew") Wrapper<ZhusheliebiaoEntity> wrapper);
	
	List<ZhusheliebiaoView> selectListView(@Param("ew") Wrapper<ZhusheliebiaoEntity> wrapper);

	List<ZhusheliebiaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZhusheliebiaoEntity> wrapper);
	
	ZhusheliebiaoView selectView(@Param("ew") Wrapper<ZhusheliebiaoEntity> wrapper);
	
}
