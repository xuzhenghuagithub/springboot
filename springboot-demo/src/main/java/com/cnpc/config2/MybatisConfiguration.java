package com.cnpc.config2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfiguration {
    @Bean
    public MySqlSessionFactory mySqlSessionFactory(){
        return new MySqlSessionFactory();
    }
}
