package com.dao;

import com.entity.HuanzheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuanzheVO;
import com.entity.view.HuanzheView;


/**
 * 患者
 * 
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public interface HuanzheDao extends BaseMapper<HuanzheEntity> {
	
	List<HuanzheVO> selectListVO(@Param("ew") Wrapper<HuanzheEntity> wrapper);
	
	HuanzheVO selectVO(@Param("ew") Wrapper<HuanzheEntity> wrapper);
	
	List<HuanzheView> selectListView(@Param("ew") Wrapper<HuanzheEntity> wrapper);

	List<HuanzheView> selectListView(Pagination page,@Param("ew") Wrapper<HuanzheEntity> wrapper);
	
	HuanzheView selectView(@Param("ew") Wrapper<HuanzheEntity> wrapper);
	
}
