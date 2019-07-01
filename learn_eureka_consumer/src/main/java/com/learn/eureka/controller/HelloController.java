package com.learn.eureka.controller;

import com.learn.eureka.romote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author zack.zhang
 * @projectName learn_cloud_eureka
 * @title HelloController
 * @package com.learn.eureka.controller
 * @description
 * @date 2019-07-01 16:01
 */
@RestController
public class HelloController {
    @Autowired
    private HelloRemote helloRemote;
    @RequestMapping("/hello")
    public String hello(){
        HashMap<String, String> param = new HashMap();
        param.put("signature","万般皆下品，唯有读书高");

        return helloRemote.hello(param);
    }
}
