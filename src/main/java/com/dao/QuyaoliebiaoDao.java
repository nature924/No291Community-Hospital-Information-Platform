package com.dao;

import com.entity.QuyaoliebiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuyaoliebiaoVO;
import com.entity.view.QuyaoliebiaoView;


/**
 * 取药列表
 * 
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public interface QuyaoliebiaoDao extends BaseMapper<QuyaoliebiaoEntity> {
	
	List<QuyaoliebiaoVO> selectListVO(@Param("ew") Wrapper<QuyaoliebiaoEntity> wrapper);
	
	QuyaoliebiaoVO selectVO(@Param("ew") Wrapper<QuyaoliebiaoEntity> wrapper);
	
	List<QuyaoliebiaoView> selectListView(@Param("ew") Wrapper<QuyaoliebiaoEntity> wrapper);

	List<QuyaoliebiaoView> selectListView(Pagination page,@Param("ew") Wrapper<QuyaoliebiaoEntity> wrapper);
	
	QuyaoliebiaoView selectView(@Param("ew") Wrapper<QuyaoliebiaoEntity> wrapper);
	
}
