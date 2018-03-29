package com.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.MmAppletFileUploadDao;
import com.entity.MmAppletFileUploadEntity;
import com.service.MmAppletFileUploadService;
import com.utils.PageUtils;
import com.utils.Query;

/**
 * 
 * @author lfy.xys
 * @date 2018-03-29 10:48:43
 */
@Service("mmAppletFileUploadService")
public class MmAppletFileUploadServiceImpl extends ServiceImpl<MmAppletFileUploadDao, MmAppletFileUploadEntity> implements MmAppletFileUploadService {

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		Page<MmAppletFileUploadEntity> page = this.selectPage(new Query<MmAppletFileUploadEntity>(params).getPage(), new EntityWrapper<MmAppletFileUploadEntity>());

		return new PageUtils(page);
	}

}
