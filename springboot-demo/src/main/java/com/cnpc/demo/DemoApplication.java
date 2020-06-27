package com.cnpc.demo;

import com.cnpc.config1.MyRedisTemplate;
import com.cnpc.config2.MySqlSessionFactory;
import com.cnpc.importselector.MyEnableConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 默认只能加载DemoApplication同级目录及器子目录下的配置文件
 * MyEnableConfiguration注解将RedisConfiguration和MybatisConfiguration配置类装载进来了
 */
@MyEnableConfiguration
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        System.out.println(context.getBean(MyRedisTemplate.class));
        System.out.println(context.getBean(MySqlSessionFactory.class));
    }

}
