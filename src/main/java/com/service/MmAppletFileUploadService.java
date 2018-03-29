package com.service;

import java.util.Map;

import com.baomidou.mybatisplus.service.IService;
import com.entity.MmAppletFileUploadEntity;
import com.utils.PageUtils;

/**
 * 文件表
 *
 * @author lfy.xys
 * @date 2018-03-29 10:48:43
 */
public interface MmAppletFileUploadService extends IService<MmAppletFileUploadEntity>{

    PageUtils queryPage(Map<String, Object> params);
}

