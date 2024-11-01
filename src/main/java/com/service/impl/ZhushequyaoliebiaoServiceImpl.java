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


import com.dao.ZhushequyaoliebiaoDao;
import com.entity.ZhushequyaoliebiaoEntity;
import com.service.ZhushequyaoliebiaoService;
import com.entity.vo.ZhushequyaoliebiaoVO;
import com.entity.view.ZhushequyaoliebiaoView;

@Service("zhushequyaoliebiaoService")
public class ZhushequyaoliebiaoServiceImpl extends ServiceImpl<ZhushequyaoliebiaoDao, ZhushequyaoliebiaoEntity> implements ZhushequyaoliebiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhushequyaoliebiaoEntity> page = this.selectPage(
                new Query<ZhushequyaoliebiaoEntity>(params).getPage(),
                new EntityWrapper<ZhushequyaoliebiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhushequyaoliebiaoEntity> wrapper) {
		  Page<ZhushequyaoliebiaoView> page =new Query<ZhushequyaoliebiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhushequyaoliebiaoVO> selectListVO(Wrapper<ZhushequyaoliebiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhushequyaoliebiaoVO selectVO(Wrapper<ZhushequyaoliebiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhushequyaoliebiaoView> selectListView(Wrapper<ZhushequyaoliebiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhushequyaoliebiaoView selectView(Wrapper<ZhushequyaoliebiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
