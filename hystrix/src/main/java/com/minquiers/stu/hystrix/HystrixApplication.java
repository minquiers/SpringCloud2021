package com.minquiers.stu.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableCircuitBreaker
public class HystrixApplication {

    @RequestMapping("")
    @HystrixCommand(fallbackMethod = "hiErrorCallBack")
    public String hi(@RequestParam(value = "error", required = false) boolean error) {
        if (error) {
            int i = 1 / 0;
        }
        return "hi";
    }

    public String hiErrorCallBack(boolean error) {
        return "出现了错误！";
    }


    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class, args);
    }

}
