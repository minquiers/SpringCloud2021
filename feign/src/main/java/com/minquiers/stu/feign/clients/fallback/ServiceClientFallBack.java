package com.minquiers.stu.feign.clients.fallback;

import com.minquiers.stu.feign.clients.ServiceClient;
import org.springframework.stereotype.Component;

@Component
public class ServiceClientFallBack implements ServiceClient {

    @Override
    public String hello(boolean error) {
        return "error:ServiceClientFallBack";
    }
}
