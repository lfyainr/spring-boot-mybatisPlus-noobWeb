package com.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.MmAppletFileUploadEntity;
import com.service.MmAppletFileUploadService;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 文件表
 * 
 * @author lfy.xys
 * @date 2018-03-29 10:48:43
 */
@RestController
@RequestMapping("mmappletfileupload")
public class MmAppletFileUploadController {
	@Autowired
	private MmAppletFileUploadService mmAppletFileUploadService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public R list(@RequestParam Map<String, Object> params) {
		PageUtils page = mmAppletFileUploadService.queryPage(params);

		return R.ok().put("page", page);
	}

	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	public R info(@PathVariable("id") Integer id) {
		MmAppletFileUploadEntity mmAppletFileUpload = mmAppletFileUploadService.selectById(id);

		return R.ok().put("mmAppletFileUpload", mmAppletFileUpload);
	}

	/**
	 * 保存
	 */
	@RequestMapping("/save")
	public R save(@RequestBody MmAppletFileUploadEntity mmAppletFileUpload) {
		mmAppletFileUploadService.insert(mmAppletFileUpload);

		return R.ok();
	}

	/**
	 * 修改
	 */
	@RequestMapping("/update")
	public R update(@RequestBody MmAppletFileUploadEntity mmAppletFileUpload) {
		mmAppletFileUploadService.updateById(mmAppletFileUpload);

		return R.ok();
	}

	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	public R delete(@RequestBody Integer[] ids) {
		mmAppletFileUploadService.deleteBatchIds(Arrays.asList(ids));

		return R.ok();
	}

	@RequestMapping("/test")
	public String test() {

		return "Hello 世界！";
	}
	
}
