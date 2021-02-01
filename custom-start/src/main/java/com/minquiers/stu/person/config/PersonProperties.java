package com.minquiers.stu.person.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "system.person")
@Data
public class PersonProperties {
    private String name;
    private int age;
    private String sex;
}
