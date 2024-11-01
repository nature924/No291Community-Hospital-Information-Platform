package com.dao;

import com.entity.YaopinguanliyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaopinguanliyuanVO;
import com.entity.view.YaopinguanliyuanView;


/**
 * 药品管理员
 * 
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public interface YaopinguanliyuanDao extends BaseMapper<YaopinguanliyuanEntity> {
	
	List<YaopinguanliyuanVO> selectListVO(@Param("ew") Wrapper<YaopinguanliyuanEntity> wrapper);
	
	YaopinguanliyuanVO selectVO(@Param("ew") Wrapper<YaopinguanliyuanEntity> wrapper);
	
	List<YaopinguanliyuanView> selectListView(@Param("ew") Wrapper<YaopinguanliyuanEntity> wrapper);

	List<YaopinguanliyuanView> selectListView(Pagination page,@Param("ew") Wrapper<YaopinguanliyuanEntity> wrapper);
	
	YaopinguanliyuanView selectView(@Param("ew") Wrapper<YaopinguanliyuanEntity> wrapper);
	
}
