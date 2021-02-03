package com.minquiers.stu.sentinel.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

@Service
public class TestService {


    /**
     * #注解用来标识资源是否被限流、降级。上述例子上该注解的属性 sayHello 表示资源名
     * @SentinelResource 还提供了其它额外的属性如 blockHandler，blockHandlerClass，fallback
     * 用于表示限流或降级的操作（注意有方法签名要求），更多内容可以参考 Sentinel 注解支持文档。若不配置 blockHandler、fallback 等函数，
     * 则被流控降级时方法会直接抛出对应的 BlockException；若方法未定义 throws BlockException 则会被 JVM 包装一层 UndeclaredThrowableException
     * @param name
     * @return
     */
    @SentinelResource(value = "sayHello")
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
