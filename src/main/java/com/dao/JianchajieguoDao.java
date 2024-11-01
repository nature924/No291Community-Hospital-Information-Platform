package com.dao;

import com.entity.JianchajieguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianchajieguoVO;
import com.entity.view.JianchajieguoView;


/**
 * 检查结果
 * 
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public interface JianchajieguoDao extends BaseMapper<JianchajieguoEntity> {
	
	List<JianchajieguoVO> selectListVO(@Param("ew") Wrapper<JianchajieguoEntity> wrapper);
	
	JianchajieguoVO selectVO(@Param("ew") Wrapper<JianchajieguoEntity> wrapper);
	
	List<JianchajieguoView> selectListView(@Param("ew") Wrapper<JianchajieguoEntity> wrapper);

	List<JianchajieguoView> selectListView(Pagination page,@Param("ew") Wrapper<JianchajieguoEntity> wrapper);
	
	JianchajieguoView selectView(@Param("ew") Wrapper<JianchajieguoEntity> wrapper);
	
}
