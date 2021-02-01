package com.minquiers.stu.person.config;

public class PersonService {
    private PersonProperties properties;

    public PersonService(PersonProperties properties) {
        this.properties = properties;
    }

    public String sayHello() {
       return  String.format("大家好，我叫: %s, 今年 %s岁, 性别: %s",
               properties.getName(), properties.getAge(), properties.getSex());
    }

}
