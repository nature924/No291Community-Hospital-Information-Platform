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


import com.dao.WanchengzhusheliebiaoDao;
import com.entity.WanchengzhusheliebiaoEntity;
import com.service.WanchengzhusheliebiaoService;
import com.entity.vo.WanchengzhusheliebiaoVO;
import com.entity.view.WanchengzhusheliebiaoView;

@Service("wanchengzhusheliebiaoService")
public class WanchengzhusheliebiaoServiceImpl extends ServiceImpl<WanchengzhusheliebiaoDao, WanchengzhusheliebiaoEntity> implements WanchengzhusheliebiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WanchengzhusheliebiaoEntity> page = this.selectPage(
                new Query<WanchengzhusheliebiaoEntity>(params).getPage(),
                new EntityWrapper<WanchengzhusheliebiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WanchengzhusheliebiaoEntity> wrapper) {
		  Page<WanchengzhusheliebiaoView> page =new Query<WanchengzhusheliebiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WanchengzhusheliebiaoVO> selectListVO(Wrapper<WanchengzhusheliebiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WanchengzhusheliebiaoVO selectVO(Wrapper<WanchengzhusheliebiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WanchengzhusheliebiaoView> selectListView(Wrapper<WanchengzhusheliebiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WanchengzhusheliebiaoView selectView(Wrapper<WanchengzhusheliebiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
