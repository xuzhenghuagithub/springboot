package com.example.springboot.Controller;

import com.example.springboot.Domain.User;
import com.example.springboot.Service.MybatisService;
import com.example.springboot.Service.TestService;
import com.example.springboot.Service.UserService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private TestService testService;
    @Autowired
    private UserService userService;
    @Autowired
    private MybatisService mybatisService;

    @RequestMapping("/hello")
    @ResponseBody
    public String user(){
        return testService.getData();
    }

    @RequestMapping("/queryForList")
    @ResponseBody
    public List queryForList(){
        return userService.queryForList();
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public User findAll(){
        return mybatisService.findAll();
    }

    //http://localhost:8081/findById?id=537799
    @RequestMapping("/findById")
    @ResponseBody
    public User findById(User user){
        return mybatisService.findById(user);
    }

    //http://localhost:8081/findByPage?pageNum=1&pageSize=10
    @RequestMapping("/findByPage")
    @ResponseBody
    public Page<User> findByPage(int pageNum,int pageSize){
        return mybatisService.findByPage(pageNum,pageSize);
    }

    //http://127.0.0.1:8081/findByTypename/措施优化参数
    @RequestMapping("/findByTypename/{typename}")
    @ResponseBody
    public User findByTypename(@PathVariable String typename){
        return mybatisService.findByTypename(typename);
    }
    //http://localhost:8081/findUserById
    @RequestMapping("/findUserById")
    @ResponseBody
    public Page<Map> findUserById(User user){
        return mybatisService.findUserById(user);
    }

    //http://localhost:8081/findUserById1
    @RequestMapping("/findUserById1")
    @ResponseBody
    public Page<Map> findUserById1(User user){
        return mybatisService.findUserById1(user);
    }

}
