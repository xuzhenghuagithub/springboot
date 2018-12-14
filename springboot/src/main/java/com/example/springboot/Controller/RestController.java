package com.example.springboot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @RequestMapping("/rest")
    public String restful(){
        return "restful风格";
    }

    @RequestMapping("/arithmeticException")//触发除0异常
    public  String arithmeticException(){
        int a = 1/0;
        return "OK!";
    }

    @RequestMapping("/nullPointerException")
    public String nullPointerException(){
        String a = null;
        a.length();
        return "OK!";
    }

}
