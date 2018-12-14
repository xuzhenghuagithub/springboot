package com.example.springboot.Mapper;

import com.example.springboot.Domain.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

@Mapper
public interface MybatisDao {
    @Results({
            @Result(property = "nnNn", column = "NN_NN")
    })
    //声明时给id赋值为user,在其他方法中，重复使用id为user的结果映射
    /*@Results(id="user",value={
            @Result(property="nnNn",column="NN_NN")
    })*/
    @Select("select id,typename from  ZYYH_BASIS_DICT")
    public List<User> findAll();

    @Select("select id,typename from  ZYYH_BASIS_DICT where id=#{id}")
    public List<User> findById(User user);

    @Select("select id,typename from ZYYH_BASIS_DICT where typename=#{typename}")
    public List<User> findByTypename(@Param("typename") String name);

    //XML配置方式的动态SQL,用<script>的方式把它照搬过来，用注解来实现。适用于xml配置转换到注解配置
    @Select("<script>select id,typename from  ZYYH_BASIS_DICT <if test=\"id!=null\">where id = #{id}</if></script>")
    public List<Map> findUserById(User user);

    //结构化SQL
    @SelectProvider(type=UserDaoProvider.class,method = "findUserById1")
    public  List<Map> findUserById1(User user);

    class UserDaoProvider{
        public String findUserById1(User user){

            /*方法一:SQL拼接
            String sql = "SELECT * FROM ZYYH_BASIS_DICT";
            if(user.getId()!=null){
                sql += " where id = #{id}";
            }
            return sql;*/

            //方法二:SQl拼接
            return new SQL(){{
                SELECT("id,typename");
                SELECT("typecode");
                FROM("ZYYH_BASIS_DICT");
                if(user.getId()!=null){
                    WHERE("id=#{id}");
                }
                if(user.getTypeName()!=null){
                    WHERE("typename=#{typeName}");
                }
            }}.toString();
        }
    }

}
