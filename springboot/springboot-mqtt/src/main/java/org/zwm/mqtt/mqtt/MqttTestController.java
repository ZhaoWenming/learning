package org.zwm.mqtt.mqtt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MqttTestController {

    @Resource
    MsgWriter msgWriter;

    @RequestMapping("/test")
    public String sendMqttMessage() {
        msgWriter.sendToMqtt("发送数据", "/test");
        return "ok";
    }
}
