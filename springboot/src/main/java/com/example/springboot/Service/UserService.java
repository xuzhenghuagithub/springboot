package com.example.springboot.Service;

import com.example.springboot.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;

    public List queryForList(){
        return userDao.queryForList();
    }
}
