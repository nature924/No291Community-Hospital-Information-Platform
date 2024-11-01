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


import com.dao.ZhusheliebiaoDao;
import com.entity.ZhusheliebiaoEntity;
import com.service.ZhusheliebiaoService;
import com.entity.vo.ZhusheliebiaoVO;
import com.entity.view.ZhusheliebiaoView;

@Service("zhusheliebiaoService")
public class ZhusheliebiaoServiceImpl extends ServiceImpl<ZhusheliebiaoDao, ZhusheliebiaoEntity> implements ZhusheliebiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhusheliebiaoEntity> page = this.selectPage(
                new Query<ZhusheliebiaoEntity>(params).getPage(),
                new EntityWrapper<ZhusheliebiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhusheliebiaoEntity> wrapper) {
		  Page<ZhusheliebiaoView> page =new Query<ZhusheliebiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhusheliebiaoVO> selectListVO(Wrapper<ZhusheliebiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhusheliebiaoVO selectVO(Wrapper<ZhusheliebiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhusheliebiaoView> selectListView(Wrapper<ZhusheliebiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhusheliebiaoView selectView(Wrapper<ZhusheliebiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
