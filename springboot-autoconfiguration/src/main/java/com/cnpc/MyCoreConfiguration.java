package com.cnpc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyCoreConfiguration {
    @Bean
    public MyCoreBean myCoreBean() {
        System.out.println("实例化MyCoreBean");
        return new MyCoreBean();
    }
}
