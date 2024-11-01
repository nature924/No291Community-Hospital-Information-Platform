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


import com.dao.YaopinjinjiaDao;
import com.entity.YaopinjinjiaEntity;
import com.service.YaopinjinjiaService;
import com.entity.vo.YaopinjinjiaVO;
import com.entity.view.YaopinjinjiaView;

@Service("yaopinjinjiaService")
public class YaopinjinjiaServiceImpl extends ServiceImpl<YaopinjinjiaDao, YaopinjinjiaEntity> implements YaopinjinjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaopinjinjiaEntity> page = this.selectPage(
                new Query<YaopinjinjiaEntity>(params).getPage(),
                new EntityWrapper<YaopinjinjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaopinjinjiaEntity> wrapper) {
		  Page<YaopinjinjiaView> page =new Query<YaopinjinjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YaopinjinjiaVO> selectListVO(Wrapper<YaopinjinjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YaopinjinjiaVO selectVO(Wrapper<YaopinjinjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YaopinjinjiaView> selectListView(Wrapper<YaopinjinjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaopinjinjiaView selectView(Wrapper<YaopinjinjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
