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


import com.dao.QuyaoliebiaoDao;
import com.entity.QuyaoliebiaoEntity;
import com.service.QuyaoliebiaoService;
import com.entity.vo.QuyaoliebiaoVO;
import com.entity.view.QuyaoliebiaoView;

@Service("quyaoliebiaoService")
public class QuyaoliebiaoServiceImpl extends ServiceImpl<QuyaoliebiaoDao, QuyaoliebiaoEntity> implements QuyaoliebiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuyaoliebiaoEntity> page = this.selectPage(
                new Query<QuyaoliebiaoEntity>(params).getPage(),
                new EntityWrapper<QuyaoliebiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuyaoliebiaoEntity> wrapper) {
		  Page<QuyaoliebiaoView> page =new Query<QuyaoliebiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QuyaoliebiaoVO> selectListVO(Wrapper<QuyaoliebiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuyaoliebiaoVO selectVO(Wrapper<QuyaoliebiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuyaoliebiaoView> selectListView(Wrapper<QuyaoliebiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuyaoliebiaoView selectView(Wrapper<QuyaoliebiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
