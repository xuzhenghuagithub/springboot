package com.example.springboot.Dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public List queryForList(){
        String sql = "select typename from ZYYH_BASIS_DICT where id = '537799'";
        return jdbcTemplate.queryForList(sql);
    }
}
