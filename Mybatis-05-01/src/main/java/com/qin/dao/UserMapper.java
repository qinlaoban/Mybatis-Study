package com.qin.dao;

import com.qin.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @program: Mybatis-Study
 * @description: interface
 * @author: Qin
 * @date: 2020-03-28
 **/
public interface UserMapper {
    @Select("select *from user")
    List<User> getAllUsers();
    @Select("select *from user where id = #{id}")
    User getUserById(@Param("d") int id,@Param("name") String name);
    @Insert("insert into user(id,name,pwd) values(#{id},#{name},#{password})")
    int addUser(User user);

    @Update("update user set name=#{name} where id =#{id}")
    int updateUser(User user);
    @Delete("delete from user where id =#{id} and name=#{name}")
    int deleteUserById(@Param("id") int id ,@Param("name") String name);

}
