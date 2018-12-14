package com.example.springboot.Service;

import com.example.springboot.Bean.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestBean testBean;

    public String getData(){
        return testBean.getData();
    }
}
