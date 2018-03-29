package com.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 文件表
 * 
 * @author lfy.xys
 * @date 2018-03-29 10:48:43
 */
@TableName("mm_applet_file_upload")
public class MmAppletFileUploadEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Integer id;
	/**
	 * 外键
	 */
	private String taskId;
	/**
	 * 文件名称
	 */
	private String name;
	/**
	 * 文件的服务端名字
	 */
	private String servName;
	/**
	 * 文件后缀
	 */
	private String suffix;
	/**
	 * 文件总大小，未进行换算
	 */
	private Integer filesizeNum;
	/**
	 * 文件总大小，进行换算KB、MB等
	 */
	private String filesize;
	/**
	 * 已经上传大小
	 */
	private Integer totalsize;
	/**
	 * 客户端IP
	 */
	private String clientIp;
	/**
	 * 客户端路径
	 */
	private String clientPath;
	/**
	 * 百分比
	 */
	private String percent;
	/**
	 * 服务端路径
	 */
	private String serverPath;
	/**
	 * 下载地址
	 */
	private String downloadPath;
	/**
	 * 创建人ID/上传人ID
	 */
	private String sUser;
	/**
	 * 更新时间
	 */
	private String sAtime;
	/**
	 * 上传时间
	 */
	private String sMtime;
	/**
	 * 文件状态
	 */
	private String fileState;
	/**
	 * 备注
	 */
	private String remarks;
	/**
	 * MD5标识
	 */
	private String md5;
	/**
	 * 
	 */
	private String batchMark;

	/**
	 * 设置：主键
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 获取：主键
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 设置：外键
	 */
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	/**
	 * 获取：外键
	 */
	public String getTaskId() {
		return taskId;
	}

	/**
	 * 设置：文件名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取：文件名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置：文件的服务端名字
	 */
	public void setServName(String servName) {
		this.servName = servName;
	}

	/**
	 * 获取：文件的服务端名字
	 */
	public String getServName() {
		return servName;
	}

	/**
	 * 设置：文件后缀
	 */
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	/**
	 * 获取：文件后缀
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * 设置：文件总大小，未进行换算
	 */
	public void setFilesizeNum(Integer filesizeNum) {
		this.filesizeNum = filesizeNum;
	}

	/**
	 * 获取：文件总大小，未进行换算
	 */
	public Integer getFilesizeNum() {
		return filesizeNum;
	}

	/**
	 * 设置：文件总大小，进行换算KB、MB等
	 */
	public void setFilesize(String filesize) {
		this.filesize = filesize;
	}

	/**
	 * 获取：文件总大小，进行换算KB、MB等
	 */
	public String getFilesize() {
		return filesize;
	}

	/**
	 * 设置：已经上传大小
	 */
	public void setTotalsize(Integer totalsize) {
		this.totalsize = totalsize;
	}

	/**
	 * 获取：已经上传大小
	 */
	public Integer getTotalsize() {
		return totalsize;
	}

	/**
	 * 设置：客户端IP
	 */
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	/**
	 * 获取：客户端IP
	 */
	public String getClientIp() {
		return clientIp;
	}

	/**
	 * 设置：客户端路径
	 */
	public void setClientPath(String clientPath) {
		this.clientPath = clientPath;
	}

	/**
	 * 获取：客户端路径
	 */
	public String getClientPath() {
		return clientPath;
	}

	/**
	 * 设置：百分比
	 */
	public void setPercent(String percent) {
		this.percent = percent;
	}

	/**
	 * 获取：百分比
	 */
	public String getPercent() {
		return percent;
	}

	/**
	 * 设置：服务端路径
	 */
	public void setServerPath(String serverPath) {
		this.serverPath = serverPath;
	}

	/**
	 * 获取：服务端路径
	 */
	public String getServerPath() {
		return serverPath;
	}

	/**
	 * 设置：下载地址
	 */
	public void setDownloadPath(String downloadPath) {
		this.downloadPath = downloadPath;
	}

	/**
	 * 获取：下载地址
	 */
	public String getDownloadPath() {
		return downloadPath;
	}

	/**
	 * 设置：创建人ID/上传人ID
	 */
	public void setSUser(String sUser) {
		this.sUser = sUser;
	}

	/**
	 * 获取：创建人ID/上传人ID
	 */
	public String getSUser() {
		return sUser;
	}

	/**
	 * 设置：更新时间
	 */
	public void setSAtime(String sAtime) {
		this.sAtime = sAtime;
	}

	/**
	 * 获取：更新时间
	 */
	public String getSAtime() {
		return sAtime;
	}

	/**
	 * 设置：上传时间
	 */
	public void setSMtime(String sMtime) {
		this.sMtime = sMtime;
	}

	/**
	 * 获取：上传时间
	 */
	public String getSMtime() {
		return sMtime;
	}

	/**
	 * 设置：文件状态
	 */
	public void setFileState(String fileState) {
		this.fileState = fileState;
	}

	/**
	 * 获取：文件状态
	 */
	public String getFileState() {
		return fileState;
	}

	/**
	 * 设置：备注
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * 获取：备注
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * 设置：MD5标识
	 */
	public void setMd5(String md5) {
		this.md5 = md5;
	}

	/**
	 * 获取：MD5标识
	 */
	public String getMd5() {
		return md5;
	}

	/**
	 * 设置：
	 */
	public void setBatchMark(String batchMark) {
		this.batchMark = batchMark;
	}

	/**
	 * 获取：
	 */
	public String getBatchMark() {
		return batchMark;
	}
}
