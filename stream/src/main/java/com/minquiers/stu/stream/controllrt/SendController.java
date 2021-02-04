package com.minquiers.stu.stream.controllrt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendController {

    @Autowired
    private Processor processor;

    /**
     * 发送消息
     * @param msg
     * @return
     */
    @GetMapping("/send")
    public String send(@RequestParam("msg") String msg){
        processor.output().send(MessageBuilder.withPayload(msg).build());
        return "success";
    }
}
