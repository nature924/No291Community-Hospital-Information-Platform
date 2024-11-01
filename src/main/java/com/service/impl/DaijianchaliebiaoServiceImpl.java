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


import com.dao.DaijianchaliebiaoDao;
import com.entity.DaijianchaliebiaoEntity;
import com.service.DaijianchaliebiaoService;
import com.entity.vo.DaijianchaliebiaoVO;
import com.entity.view.DaijianchaliebiaoView;

@Service("daijianchaliebiaoService")
public class DaijianchaliebiaoServiceImpl extends ServiceImpl<DaijianchaliebiaoDao, DaijianchaliebiaoEntity> implements DaijianchaliebiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaijianchaliebiaoEntity> page = this.selectPage(
                new Query<DaijianchaliebiaoEntity>(params).getPage(),
                new EntityWrapper<DaijianchaliebiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaijianchaliebiaoEntity> wrapper) {
		  Page<DaijianchaliebiaoView> page =new Query<DaijianchaliebiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaijianchaliebiaoVO> selectListVO(Wrapper<DaijianchaliebiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaijianchaliebiaoVO selectVO(Wrapper<DaijianchaliebiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaijianchaliebiaoView> selectListView(Wrapper<DaijianchaliebiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaijianchaliebiaoView selectView(Wrapper<DaijianchaliebiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
