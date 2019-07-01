package com.learn.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zack.zhang
 * @projectName learn_cloud_eureka
 * @title ApplicationEurekaProvider
 * @package com.learn.eureka
 * @description eureka服务提供者
 * @date 2019-06-24 10:26
 */
@SpringCloudApplication
@EnableFeignClients
public class ApplicationEurekaConsumer {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationEurekaConsumer.class, args);
    }
}
