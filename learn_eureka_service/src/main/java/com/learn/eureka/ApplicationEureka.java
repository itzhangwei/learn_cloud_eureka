package com.learn.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zack.zhang
 * @projectName learn_cloud_eureka
 * @title ApplicationEureka
 * @package com.learn
 * @description Eureka启动类
 * @date 2019-06-20 17:00
 */
@SpringBootApplication
@EnableEurekaServer
public class ApplicationEureka {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationEureka.class, args);
    }
}
