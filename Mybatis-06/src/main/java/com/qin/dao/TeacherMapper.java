package com.qin.dao;

import com.qin.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
    @Select("select *from teacher where id = #{tid}")
    Teacher getTeacher(@Param("tid") int id);
}
