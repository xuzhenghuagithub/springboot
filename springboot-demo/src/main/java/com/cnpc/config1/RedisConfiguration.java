package com.cnpc.config1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//MyImportSelector加载了RedisConfiguration的路径，这里可省略Configuration注解
//Configuration
public class RedisConfiguration {
    @Bean
    public MyRedisTemplate myRedisTemplate(){
        return new MyRedisTemplate();

    }
}
