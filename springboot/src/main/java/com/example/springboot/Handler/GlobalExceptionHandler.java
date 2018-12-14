package com.example.springboot.Handler;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

//此注解会捕捉所有Controller层的异常,如果不加,则只能跳转至指定页面,异常无法捕捉,后台报错
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req,Exception e) throws Exception{

        ModelAndView mav = new ModelAndView();
        if (e instanceof HttpClientErrorException.Unauthorized) {// 判断异常类型
            mav.addObject("exception", "无权访问!");// 根据异常类型，返回具体的展示信息
        } else {
            mav.addObject("exception", "系统错误，请联系管理员@王祥!");
        }
        mav.addObject("url", req.getRequestURL());
        mav.setViewName("error");// 异常信息展示到哪个页面，此处指定在error.html页面中进行展示
        return mav;
    }
}
