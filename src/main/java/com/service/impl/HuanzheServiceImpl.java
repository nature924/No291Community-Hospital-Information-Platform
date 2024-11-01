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


import com.dao.HuanzheDao;
import com.entity.HuanzheEntity;
import com.service.HuanzheService;
import com.entity.vo.HuanzheVO;
import com.entity.view.HuanzheView;

@Service("huanzheService")
public class HuanzheServiceImpl extends ServiceImpl<HuanzheDao, HuanzheEntity> implements HuanzheService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuanzheEntity> page = this.selectPage(
                new Query<HuanzheEntity>(params).getPage(),
                new EntityWrapper<HuanzheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuanzheEntity> wrapper) {
		  Page<HuanzheView> page =new Query<HuanzheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuanzheVO> selectListVO(Wrapper<HuanzheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuanzheVO selectVO(Wrapper<HuanzheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuanzheView> selectListView(Wrapper<HuanzheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuanzheView selectView(Wrapper<HuanzheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
