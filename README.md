# spring-boot-mybatisPlus-noobWeb
目标新手：没有ssh和ssm的基础，懂servlet

简单版本 spring-boot + mybatis Plus的搭建环境。

1、使用maven创建一个项目。修改pom.xml,引入Spring-boot的jar，再引入mybatis Plus 的jar，mysql的驱动jar

	<!--spring -->
	<!-- mybatis-plus 自动的维护了mybatis以及mybatis-spring的依赖，在springboot中这三者不能同时的出现，避免版本的冲突 （坑1）-->
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.0.0.RELEASE</version>
	</parent>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-web</artifactId>
	</dependency>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-jdbc</artifactId>
	</dependency>
	<dependency>
		<groupId>org.springframework</groupId>
		<artifactId>spring-orm</artifactId>
	</dependency>
	<!-- https://mvnrepository.com/artifact/com.baomidou/mybatis-plus -->
	<dependency>
		<groupId>com.baomidou</groupId>
		<artifactId>mybatis-plus</artifactId>
		<version>2.1.9</version>
	</dependency>
	<dependency>
		<groupId>com.baomidou</groupId>
		<artifactId>mybatisplus-spring-boot-starter</artifactId>
		<version>1.0.5</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
	<dependency>
		<groupId>mysql</groupId>
		<artifactId>mysql-connector-java</artifactId>
		<version>6.0.6</version>
	</dependency>
2、使用 application.yml，不使用application.properties。

	server:
	  port: 8080
	spring:
	  datasource:
	    # 使用druid数据源，替换DBCP和C3P0 。 druid可查看https://www.cnblogs.com/soundcode/p/6485375.html
	    type: com.alibaba.druid.pool.DruidDataSource
	    # 旧的版本需要使用 com.mysql.jdbc.Driver  
	    driver-class-name: com.mysql.cj.jdbc.Driver
	    url: jdbc:mysql://localhost:3306/applet?allowMultiQueries=true&useUnicode=true&characterEncoding=UTF-8
	    username: root
	    password: 1234
	mybatis-plus:
	  mapper-locations: classpath:dao/*.xml
	  #实体扫描，多个package用逗号或者分号分隔
	  typeAliasesPackage: com.entity

如此，我们需要加入druid的jar，返回修改pom.xml，加入

	<!-- alibaba的druid数据库连接池 -->
	<dependency>
		<groupId>com.alibaba</groupId>
		<artifactId>druid</artifactId>
		<version>1.0.11</version>
	</dependency>

3、创建运行的类 RunApplication.java，此类必须在所有需要注解执行的包的父类中，否则不会报错，但是怎么也访问不到数据。（坑2）

	@SpringBootApplication
	@MapperScan(basePackages = {"com.dao"})//将项目中对应的 mapper/dao 类的路径加进来就可以了
	public class RunApplication {
		public static void main(String[] args) throws Exception {
	        SpringApplication.run(RunApplication.class, args);
	    }
	}

@MapperScan(basePackages = {"com.dao"}) 也可以直接写成 @MapperScan("com.dao")

如果想引入同一层的多个包，可以写成 @MapperScan("com.*.dao")

运行main方法，如果出现错误：

	Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
	
application.yml中，需要使用新的驱动包名：	com.mysql.cj.jdbc.Driver 。替换掉以前的包名：com.mysql.jdbc.Driver （坑3）

4、新建一个表 MM_APPLET_FILE_UPLOAD.sql 测试，并使用generator自动创建代码。（此处无教程，可使用 https://gitee.com/lfyainr/renren-generator 人人的一套生成工具），可以自己修改模板，使之对应当前的框架结构（可以下载源码的文件以节约时间）。

生成的文件为  controller、dao 也有人叫mapper 、entity 也有人叫model 、service 、impl 五个java文件，还有一个 mapper.xml 的mybatis的sql文件。其他文件为前端文件，不做处理。

需要对这6个文件做相应的处理，因为 xxDao 继承了BaseMapper，所以不需要进行简单的 CURD 的代码以及 sql的编写，节省了大量时间。

5、启动

输入 http://localhost:8080/mmappletfileupload/list 会得到 success 的信息，即创建成功。

输入 http://localhost:8080/mmappletfileupload/test 会得到 “Hello 世界！” 的信息。

输入 http://localhost:8080/test/test 会得到 “Hello world!” 的信息。

这个在 MmAppletFileUploadController.java 中，通过 test() 方法，通过class的注解 和 method的注解，进行映射的接口信息，新手知道前后台的交互即可 在前端使用 ajax进行读取数据，例子为 Test.java。

6、其他

utils包 是使用的 renren开源 的一套 分页工具。
