package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * @author qinlaoban
 * @date 2020/3/23
 */
public class UserMapperTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println("user:" +user);
        }
        User uerById = mapper.getUerById(1);
        System.out.println("user==" +uerById  );

        sqlSession.close();
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User u = mapper.getUerById(1);
        System.out.println("u:" + u);


        sqlSession.close();
    }


    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User u = new User();
        u.setId(5);
        u.setName("qin");
        u.setPwd("aaa");
        int result = mapper.addUser(u);
        if (result > 0) {
            System.out.println("插入成功");
        }
        sqlSession.commit();
        System.out.println("u:" + u);


        sqlSession.close();
    }


    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User u = new User(4,"hahh1","aaa");
        int r = mapper.updateUserById(u);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(4);
        sqlSession.commit();


    }
}
