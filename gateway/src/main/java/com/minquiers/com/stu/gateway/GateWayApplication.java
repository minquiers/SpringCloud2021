package com.minquiers.com.stu.gateway;

import com.minquiers.com.stu.gateway.filter.CustomGlobalFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GateWayApplication {
    @Bean
    public GlobalFilter customFilter() {
        return new CustomGlobalFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class, args);
    }
}
