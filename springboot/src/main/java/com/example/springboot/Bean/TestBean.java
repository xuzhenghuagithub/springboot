package com.example.springboot.Bean;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TestBean {
    public String getData() {
        return new Date().toString();
    }
}
