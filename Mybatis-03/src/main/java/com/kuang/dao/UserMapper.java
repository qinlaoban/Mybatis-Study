package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author qinlaoban
 * @date 2020/3/22
 */
public interface UserMapper {

     /**根据id查询哦用户
      * @param id
      * @return user
      * */
     User getUerById(int id);
     /**
      * @description: 分页获取
      * @param: map<star,page></star,page>
      * @return: users
      */
     List<User> getUserByLimit(Map<String,Integer> map);


}
