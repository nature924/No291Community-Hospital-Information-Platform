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


import com.dao.JianchajieguoDao;
import com.entity.JianchajieguoEntity;
import com.service.JianchajieguoService;
import com.entity.vo.JianchajieguoVO;
import com.entity.view.JianchajieguoView;

@Service("jianchajieguoService")
public class JianchajieguoServiceImpl extends ServiceImpl<JianchajieguoDao, JianchajieguoEntity> implements JianchajieguoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianchajieguoEntity> page = this.selectPage(
                new Query<JianchajieguoEntity>(params).getPage(),
                new EntityWrapper<JianchajieguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianchajieguoEntity> wrapper) {
		  Page<JianchajieguoView> page =new Query<JianchajieguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianchajieguoVO> selectListVO(Wrapper<JianchajieguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianchajieguoVO selectVO(Wrapper<JianchajieguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianchajieguoView> selectListView(Wrapper<JianchajieguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianchajieguoView selectView(Wrapper<JianchajieguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
