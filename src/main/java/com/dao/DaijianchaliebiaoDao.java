package com.dao;

import com.entity.DaijianchaliebiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaijianchaliebiaoVO;
import com.entity.view.DaijianchaliebiaoView;


/**
 * 待检查列表
 * 
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public interface DaijianchaliebiaoDao extends BaseMapper<DaijianchaliebiaoEntity> {
	
	List<DaijianchaliebiaoVO> selectListVO(@Param("ew") Wrapper<DaijianchaliebiaoEntity> wrapper);
	
	DaijianchaliebiaoVO selectVO(@Param("ew") Wrapper<DaijianchaliebiaoEntity> wrapper);
	
	List<DaijianchaliebiaoView> selectListView(@Param("ew") Wrapper<DaijianchaliebiaoEntity> wrapper);

	List<DaijianchaliebiaoView> selectListView(Pagination page,@Param("ew") Wrapper<DaijianchaliebiaoEntity> wrapper);
	
	DaijianchaliebiaoView selectView(@Param("ew") Wrapper<DaijianchaliebiaoEntity> wrapper);
	
}
