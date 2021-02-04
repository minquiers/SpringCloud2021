package com.minquiers.stu.stream.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageListener {
    @StreamListener(Processor.INPUT)
    public void processMyMessage(String message) {
        log.info("接收到消息：" + message);
    }
}
