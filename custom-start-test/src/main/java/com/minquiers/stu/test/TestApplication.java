package com.minquiers.stu.test;

import com.minquiers.stu.person.config.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestApplication {

    @Autowired
    private PersonService personService;

    @GetMapping("/sayHello")
    public String sayHello(){
        return personService.sayHello();
    }

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
