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


import com.dao.YaopinguanliyuanDao;
import com.entity.YaopinguanliyuanEntity;
import com.service.YaopinguanliyuanService;
import com.entity.vo.YaopinguanliyuanVO;
import com.entity.view.YaopinguanliyuanView;

@Service("yaopinguanliyuanService")
public class YaopinguanliyuanServiceImpl extends ServiceImpl<YaopinguanliyuanDao, YaopinguanliyuanEntity> implements YaopinguanliyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaopinguanliyuanEntity> page = this.selectPage(
                new Query<YaopinguanliyuanEntity>(params).getPage(),
                new EntityWrapper<YaopinguanliyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaopinguanliyuanEntity> wrapper) {
		  Page<YaopinguanliyuanView> page =new Query<YaopinguanliyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YaopinguanliyuanVO> selectListVO(Wrapper<YaopinguanliyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YaopinguanliyuanVO selectVO(Wrapper<YaopinguanliyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YaopinguanliyuanView> selectListView(Wrapper<YaopinguanliyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaopinguanliyuanView selectView(Wrapper<YaopinguanliyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
