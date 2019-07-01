package com.learn.eureka.romote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

/**
 * @author zack.zhang
 * @projectName learn_cloud_eureka
 * @title remote
 * @package com.learn.eureka
 * @description HelloRemote
 * @date 2019-07-01 15:54
 */
// FeignClient 的服务提供者名称需要和 spring.application.name 一直
@FeignClient(name = "eureka-provider", path = "/eureka/provider")
public interface HelloRemote {

    @RequestMapping("/hello")
    String hello(@RequestBody HashMap param);
}
