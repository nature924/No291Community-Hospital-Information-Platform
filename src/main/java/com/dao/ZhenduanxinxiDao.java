package com.dao;

import com.entity.ZhenduanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhenduanxinxiVO;
import com.entity.view.ZhenduanxinxiView;


/**
 * 诊断信息
 * 
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public interface ZhenduanxinxiDao extends BaseMapper<ZhenduanxinxiEntity> {
	
	List<ZhenduanxinxiVO> selectListVO(@Param("ew") Wrapper<ZhenduanxinxiEntity> wrapper);
	
	ZhenduanxinxiVO selectVO(@Param("ew") Wrapper<ZhenduanxinxiEntity> wrapper);
	
	List<ZhenduanxinxiView> selectListView(@Param("ew") Wrapper<ZhenduanxinxiEntity> wrapper);

	List<ZhenduanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhenduanxinxiEntity> wrapper);
	
	ZhenduanxinxiView selectView(@Param("ew") Wrapper<ZhenduanxinxiEntity> wrapper);
	
}
