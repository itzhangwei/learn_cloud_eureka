package com.learn.eureka.controller;

import com.learn.eureka.entity.Personal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
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
    
    
    @RequestMapping("/foo")
    public String foo(String foo) {
        return "this foo2 is  :" + foo;
    }
    
    
    @RequestMapping("/personal")
    @ResponseBody
    public Personal getPersonal() {
        Personal personal = new Personal();
        personal.setBirth(new Date());
        personal.setName("张三");
        return personal;
    }
}
