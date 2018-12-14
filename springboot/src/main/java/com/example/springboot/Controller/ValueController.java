package com.example.springboot.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource(value={"classpath:config/parameter.properties","classpath:application.properties"})
public class ValueController {
    @Value(value="${message}")
    private String message;
    @Value(value="${key1}")
    private String key;

    @RequestMapping("/value")
    public String getValue(){
        return message;
    }

    @RequestMapping("/parameter")
    public String getParameter(){
        return key;
    }
}
