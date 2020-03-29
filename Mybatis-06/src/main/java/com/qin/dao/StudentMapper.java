package com.qin.dao;

import com.qin.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: Mybatis-Study
 * @description:
 * @author: Qin
 * @date: 2020-03-27
 **/
public interface StudentMapper {
    List<Student> getStudents();
    List<Student> getStudents2();

    Student getStudentById(@Param("id") int id, String name);
}
