package com.dao;

import com.entity.YaopinjinjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaopinjinjiaVO;
import com.entity.view.YaopinjinjiaView;


/**
 * 药品进价
 * 
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public interface YaopinjinjiaDao extends BaseMapper<YaopinjinjiaEntity> {
	
	List<YaopinjinjiaVO> selectListVO(@Param("ew") Wrapper<YaopinjinjiaEntity> wrapper);
	
	YaopinjinjiaVO selectVO(@Param("ew") Wrapper<YaopinjinjiaEntity> wrapper);
	
	List<YaopinjinjiaView> selectListView(@Param("ew") Wrapper<YaopinjinjiaEntity> wrapper);

	List<YaopinjinjiaView> selectListView(Pagination page,@Param("ew") Wrapper<YaopinjinjiaEntity> wrapper);
	
	YaopinjinjiaView selectView(@Param("ew") Wrapper<YaopinjinjiaEntity> wrapper);
	
}
