package com.example.springboot.Service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {
    @Async
    public void task1() throws InterruptedException {
        Thread.sleep(1000);//任务线程沉睡1秒,后完成
        System.out.println("新线程1----->完成任务1");
    }

    @Async
    public void task2() throws InterruptedException {
        System.out.println("新线程2----->完成任务2");
    }
}
