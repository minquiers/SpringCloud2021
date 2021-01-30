package com.minquiers.stu.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class RibbonController {

    @Autowired
    @Qualifier("loadBalancedRestTemplate")
    private RestTemplate loadBalancedRestTemplate;

    @Autowired
    @Qualifier("noLoadBalancedRestTemplate")
    private RestTemplate noLoadBalancedRestTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/hello1")
    public String hello1() {
        return loadBalancedRestTemplate.getForObject("http://SERVICE/hello", String.class);
    }

    @GetMapping("/hello2")
    public String hello2() {
        return noLoadBalancedRestTemplate.getForObject(loadBalancerClient.choose("SERVICE").getUri() + "/hello", String.class);
    }
}
