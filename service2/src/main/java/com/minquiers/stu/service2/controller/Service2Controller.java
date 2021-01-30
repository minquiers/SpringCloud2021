package com.minquiers.stu.service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Service2Controller {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "error", required = false) boolean error) {
        if (error) {
            int i = 1 / 0;
        }
        return "hello server2";
    }
}
