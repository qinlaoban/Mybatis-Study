package com.kuang.dao;

import com.kuang.pojo.User;

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




}
