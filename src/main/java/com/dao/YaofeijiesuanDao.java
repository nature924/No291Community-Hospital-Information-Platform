package com.dao;

import com.entity.YaofeijiesuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaofeijiesuanVO;
import com.entity.view.YaofeijiesuanView;


/**
 * 药费结算
 * 
 * @author 
 * @email 
 * @date 2021-04-28 11:05:39
 */
public interface YaofeijiesuanDao extends BaseMapper<YaofeijiesuanEntity> {
	
	List<YaofeijiesuanVO> selectListVO(@Param("ew") Wrapper<YaofeijiesuanEntity> wrapper);
	
	YaofeijiesuanVO selectVO(@Param("ew") Wrapper<YaofeijiesuanEntity> wrapper);
	
	List<YaofeijiesuanView> selectListView(@Param("ew") Wrapper<YaofeijiesuanEntity> wrapper);

	List<YaofeijiesuanView> selectListView(Pagination page,@Param("ew") Wrapper<YaofeijiesuanEntity> wrapper);
	
	YaofeijiesuanView selectView(@Param("ew") Wrapper<YaofeijiesuanEntity> wrapper);
	
}
