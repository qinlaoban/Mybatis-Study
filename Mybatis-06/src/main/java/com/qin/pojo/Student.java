package com.qin.pojo;

import lombok.Data;

/**
 * @program: Mybatis-Study
 * @description: 学生
 * @author: Qin
 * @date: 2020-03-27
 **/
@Data
public class Student {
    private int id;
    private String name;
    private Teacher tid;


}
