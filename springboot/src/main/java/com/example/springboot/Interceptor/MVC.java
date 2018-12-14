package com.example.springboot.Interceptor;


import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootConfiguration
public class MVC extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns：添加拦截规则    excludePathPatterns： 排除拦截规则
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/error");
    }
}
