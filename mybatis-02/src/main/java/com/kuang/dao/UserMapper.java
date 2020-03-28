package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;

/**
 * @author qinlaoban
 * @date 2020/3/22
 */
public interface UserMapper {
    /**
     * 获取全部用户
     *
     * @return users
     */
     List<User>  getUserList() ;
     /**根据id查询哦用户
      * @param id
      * @return user
      * */
     User getUerById(int id);

    /**
     * @description: 添加用户
     * @param: user
     * @return:  0 1
     */
     int addUser(User u);

    /**
     * @description: 修改用户
     * @param: user
     * @return: 0 1
     */
    int updateUserById(User u);
    /**
     * @description: 删除用户
     * @param: id
     * @return: 1
     */
    int deleteUser(int id);

}
