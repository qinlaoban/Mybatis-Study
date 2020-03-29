package com.qin.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @program: Mybatis-Study
 * @description:
 * @author: Qin
 * @date: 2020-03-29
 **/
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createDate;
    private int views;
}
