package com.dao;

import com.entity.WanchengzhusheliebiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WanchengzhusheliebiaoVO;
import com.entity.view.WanchengzhusheliebiaoView;


/**
 * 完成注射列表
 * 
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public interface WanchengzhusheliebiaoDao extends BaseMapper<WanchengzhusheliebiaoEntity> {
	
	List<WanchengzhusheliebiaoVO> selectListVO(@Param("ew") Wrapper<WanchengzhusheliebiaoEntity> wrapper);
	
	WanchengzhusheliebiaoVO selectVO(@Param("ew") Wrapper<WanchengzhusheliebiaoEntity> wrapper);
	
	List<WanchengzhusheliebiaoView> selectListView(@Param("ew") Wrapper<WanchengzhusheliebiaoEntity> wrapper);

	List<WanchengzhusheliebiaoView> selectListView(Pagination page,@Param("ew") Wrapper<WanchengzhusheliebiaoEntity> wrapper);
	
	WanchengzhusheliebiaoView selectView(@Param("ew") Wrapper<WanchengzhusheliebiaoEntity> wrapper);
	
}
