package com.qin.dao;

import com.qin.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: Mybatis-Study
 * @description:
 * @author: Qin
 * @date: 2020-03-27
 **/
public interface TeacherMapper {
    /**
     * @description: 获取老师
     * @param:
     * @return:
     */


//   List<Teacher> getTeacher();

    Teacher getTeacherByID(@Param("tid") int id);


}
