package com.example.springboot.Controller;

import com.example.springboot.Service.MybatisService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    @Autowired
    private MybatisService MybatisService;
    @Test
    public void findByTypename() {
    }

    @Before
    public void setUp() throws Exception {
        System.out.print("开始");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findAll() {
        MybatisService.findAll();
    }
}