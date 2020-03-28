package com.qin.pojo;

import lombok.Data;

import java.util.List;

/**
 * @program: Mybatis-Study
 * @description: 老师
 * @author: Qin
 * @date: 2020-03-27
 **/
@Data
public class Teacher {
    private int id;
    private String name;
    private int age;
    private List<Student> students;
}
