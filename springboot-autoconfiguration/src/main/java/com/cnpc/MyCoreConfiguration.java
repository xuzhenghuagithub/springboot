package com.cnpc;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisOperations;

/**
 * 存在RedisOperations才加载配置类
 */
//@ConditionalOnClass(RedisOperations.class)
@Configuration
public class MyCoreConfiguration {
    @Bean
    public MyCoreBean myCoreBean() {
        System.out.println("实例化MyCoreBean");
        return new MyCoreBean();
    }
}








