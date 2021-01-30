package com.minquiers.stu.feign.clients;

import com.minquiers.stu.feign.clients.fallback.ServiceClientFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SERVICE", fallback = ServiceClientFallBack.class)
public interface ServiceClient {
    @GetMapping("/hello")
    String hello(@RequestParam(value = "error", required = false) boolean error);
}
