-- TRUNCATE table MM_APPLET_FILE_UPLOAD_UPLOAD;
/*==============================================================*/
/* Table: MM_APPLET_FILE_UPLOAD                                        */
/*==============================================================*/

CREATE TABLE MM_APPLET_FILE_UPLOAD 
(
   id INT NOT NULL AUTO_INCREMENT COMMENT '主键',
   TASK_ID	         VARCHAR(1000) COMMENT '外键',
   NAME                 VARCHAR(1000) COMMENT '文件名称',
   SERV_NAME            VARCHAR(1000) COMMENT '文件的服务端名字',
   SUFFIX               VARCHAR(50) COMMENT '文件后缀',
   FILESIZE_NUM         int COMMENT '文件总大小，未进行换算',
   FILESIZE             VARCHAR(40) COMMENT '文件总大小，进行换算KB、MB等',
   TOTALSIZE            int COMMENT '已经上传大小',
   CLIENT_IP            VARCHAR(50) COMMENT '客户端IP',
   CLIENT_PATH          VARCHAR(500) COMMENT '客户端路径',
   PERCENT              VARCHAR(30) COMMENT '百分比',
   SERVER_PATH          VARCHAR(500) COMMENT '服务端路径',
   DOWNLOAD_PATH        VARCHAR(500) COMMENT '下载地址',
   S_USER               VARCHAR(40) COMMENT '创建人ID/上传人ID',
   S_ATIME              VARCHAR(40) COMMENT '更新时间',
   S_MTIME              VARCHAR(40) COMMENT '上传时间',
   FILE_STATE           VARCHAR(40) COMMENT '文件状态',
   REMARKS              VARCHAR(2000) COMMENT '备注',
   MD5 					VARCHAR(100) COMMENT 'MD5标识',
   BATCH_MARK  VARCHAR(100) COMMENT '',
   PRIMARY KEY ( id )
) ENGINE=INNODB  DEFAULT CHARSET=utf8 COMMENT='文件表';
