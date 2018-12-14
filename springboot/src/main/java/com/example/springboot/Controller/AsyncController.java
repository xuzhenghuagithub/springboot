package com.example.springboot.Controller;

import com.example.springboot.Service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {
    @Autowired
    private AsyncService asyncService;

    @GetMapping("/async")
    public String async() throws InterruptedException{
        asyncService.task1();
        asyncService.task2();
        System.out.println("主线程------>完成,释放请求");
        return "OK!";
    }
}
