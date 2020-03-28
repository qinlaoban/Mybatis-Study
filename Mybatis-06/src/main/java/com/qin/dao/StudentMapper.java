package com.qin.dao;

import com.qin.pojo.Student;

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

    Student getStudentById(int id,String name);
}
