package com.minquiers.stu.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfiguration {
    @LoadBalanced
    @Bean
    RestTemplate loadBalancedRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    RestTemplate noLoadBalancedRestTemplate() {
        return new RestTemplate();
    }
}
