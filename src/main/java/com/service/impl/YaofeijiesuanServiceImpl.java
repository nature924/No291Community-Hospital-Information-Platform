package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YaofeijiesuanDao;
import com.entity.YaofeijiesuanEntity;
import com.service.YaofeijiesuanService;
import com.entity.vo.YaofeijiesuanVO;
import com.entity.view.YaofeijiesuanView;

@Service("yaofeijiesuanService")
public class YaofeijiesuanServiceImpl extends ServiceImpl<YaofeijiesuanDao, YaofeijiesuanEntity> implements YaofeijiesuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaofeijiesuanEntity> page = this.selectPage(
                new Query<YaofeijiesuanEntity>(params).getPage(),
                new EntityWrapper<YaofeijiesuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaofeijiesuanEntity> wrapper) {
		  Page<YaofeijiesuanView> page =new Query<YaofeijiesuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YaofeijiesuanVO> selectListVO(Wrapper<YaofeijiesuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YaofeijiesuanVO selectVO(Wrapper<YaofeijiesuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YaofeijiesuanView> selectListView(Wrapper<YaofeijiesuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaofeijiesuanView selectView(Wrapper<YaofeijiesuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
