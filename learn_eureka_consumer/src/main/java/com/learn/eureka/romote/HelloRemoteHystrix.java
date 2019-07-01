package com.learn.eureka.romote;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;

/**
 * @author zack.zhang
 * @projectName learn_cloud_eureka
 * @title remote
 * @package com.learn.eureka
 * @description HelloRemote
 * @date 2019-07-01 15:54
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Value(value ="${spring.application.name}")
    public String applicationName;

    public String hello(@RequestBody HashMap param){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("hello, this project name is ");
        stringBuffer.append(this.applicationName);
        stringBuffer.append(",我是作为熔断器Hystrix的fallback降级操作。");
        stringBuffer.append("参数：" + param.toString());
        return stringBuffer.toString();
    }
}
