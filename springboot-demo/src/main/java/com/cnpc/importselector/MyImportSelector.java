package com.cnpc.importselector;

import com.cnpc.config1.RedisConfiguration;
import com.cnpc.config2.MybatisConfiguration;
import org.springframework.context.annotation.ImportSelector;

import org.springframework.core.type.AnnotationMetadata;

/**
 * 动态装载 spring3.x
 * DeferredImportSelector
 * ImportBeanDefinitionRegister
 * 可传入需要导入的配置类或Bean
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        //动态导入Bean,告诉spring配置类在哪里

        //TODO 在这里去加载所有的配置类
        //通过某种机制去完成指定路径的配置类的扫描，spring制定标准，所有组件模块将配置类放在指定路径下即可
        //扫描classpath*:META-INF/spring.factories
        return new String[]{RedisConfiguration.class.getName(), MybatisConfiguration.class.getName()                                                                                     };
    }
}
