package com.learn.eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author zack.zhang
 * @projectName learn_cloud_eureka
 * @title HelloController
 * @package com.learn.eureka.controller
 * @description
 * @date 2019-07-01 14:30
 */
@RestController
public class HelloController {
    @Value(value = "${spring.application.name}")
    private String applicationName;

    @RequestMapping("/hello")
    public String hello(@RequestBody HashMap param){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello, this is project name is ");
        stringBuffer.append(applicationName);
        stringBuffer.append(",入参是:  ");
        stringBuffer.append(param.toString());
        return stringBuffer.toString();
    }
}
