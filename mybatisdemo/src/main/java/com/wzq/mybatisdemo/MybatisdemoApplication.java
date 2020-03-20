package com.wzq.mybatisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 链接Mysql数据库简单的集成Mybatis框架访问数据库。
 */
@SpringBootApplication
public class MybatisdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisdemoApplication.class, args);
        System.out.println("【【【【【【 链接MysqlMybatis数据库微服务 】】】】】】已启动.");
    }

}


/****************************************************************************************
 *  http://localhost:8325/simple/addUser?username=zyn&age=29&balance=200
 *  http://localhost:8325/simple/list
 *  http://localhost:8325/simple/3
 注意：Mybatis 需要加上 entity 等注解才可以使用，不然启动都会报错；
 @MapperScan("com.springms.cloud.mapper.**") 或者在每个 Mapper 接口文件上添加 @Mapper 也可以；

 一、简单用户链接Mysql数据库微服务（通过 mybatis 链接 mysql 编写数据访问）：

 1、启动 springms-provider-user-mysql-mybatis 模块服务，启动1个端口；
 2、在浏览器输入地址 http://localhost:8325/simple/10 可以看到用户ID=10的信息成功的被打印出来；

 3、使用 IDEA 自带工具 Test Restful WebService 发送 HTTP POST 请求,并添加 username、age、balance三个参数，然后执行请求，并去 mysql 数据库查看数据是否存在，正常情况下 mysql 数据库刚刚插入的数据成功了:
 4、使用 REST Client 执行 "/simple/list" 接口，也正常将 mysql 数据库中所有的用户信息打印出来了；
 ****************************************************************************************/
