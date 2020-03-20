package com.wzq.serviceeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 参考博客
 * https://www.jianshu.com/p/a0365a635975
 */
@SpringBootApplication
@EnableEurekaServer // 注册中心
public class ServiceEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceEurekaApplication.class, args);
    }

}
