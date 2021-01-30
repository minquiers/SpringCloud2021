package com.minquiers.stu.feign;

import com.minquiers.stu.feign.clients.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class FeignApplication {

    @Autowired
    private ServiceClient serviceClient;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "error", required = false) boolean error) {
        return serviceClient.hello(error);
    }

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }
}
