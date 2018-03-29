package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 注意对于springboot项目，
 * XxxApplication这个类要放在顶层包下，其他自己新建的包都应该是它的一个子包。注意，目录结构的关联
 * @author lfy.xys
 *
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.dao"})//将项目中对应的mapper/dao类的路径加进来就可以了
public class RunApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RunApplication.class, args);
    }
}
