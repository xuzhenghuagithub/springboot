package com.example.springboot.Service;

import com.example.springboot.Domain.User;
import com.example.springboot.Mapper.MybatisDao;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Service
@Transactional
public class MybatisService {
    @Autowired
    private MybatisDao mybatisDao;//这里会报错，但是并不会影响

    public User findAll(){
        //分页插件: 查询第1页，每页10行
        Page<User> page =PageHelper.startPage(1, 10);
        mybatisDao.findAll();
        //数据表的总行数
        page.getTotal();
        //分页查询结果的总行数
        page.size();
        //第一个User对象，参考list，序号0是第一个元素，依此类推
        User user = page.get(0);
        return user;
    }

    public Page<User> findByPage(int pageNum,int pageSize){
        //分页插件: 查询第1页，每页10行
        Page<User> page =PageHelper.startPage(pageNum,pageSize);
        mybatisDao.findAll();
        return page;
    }

    public User findById(User param){
        //分页插件: 查询第1页，每页10行
        Page<User> page =PageHelper.startPage(1, 10);
        mybatisDao.findById(param);
        //数据表的总行数
        page.getTotal();
        //分页查询结果的总行数
        page.size();
        //第一个User对象，参考list，序号0是第一个元素，依此类推
        User user = page.get(0);
        return user;
    }

    public User findByTypename(String name){
        //分页插件: 查询第1页，每页10行
        Page<User> page =PageHelper.startPage(1, 10);
        mybatisDao.findByTypename(name);
        //数据表的总行数
        page.getTotal();
        //分页查询结果的总行数
        page.size();
        //第一个User对象，参考list，序号0是第一个元素，依此类推
        User user = page.get(0);
        return user;
    }

    public Page<Map> findUserById(User user){
        Page<Map> page = PageHelper.startPage(1, 10);
        mybatisDao.findUserById(user);
        return page;
    }

    public Page<Map> findUserById1(User user){
        Page<Map> page = PageHelper.startPage(1, 10);
        mybatisDao.findUserById1(user);
        return page;
    }

}
