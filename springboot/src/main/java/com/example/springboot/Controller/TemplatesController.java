package com.example.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TemplatesController {

    @GetMapping("/templates")
    String test(HttpServletRequest request){
        request.setAttribute("key","hello world!");
        return "index";
    }

}
