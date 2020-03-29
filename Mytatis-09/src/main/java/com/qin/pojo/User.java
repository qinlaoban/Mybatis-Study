package com.qin.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: Mybatis-Study
 * @description:
 * @author: Qin
 * @date: 2020-03-29
 **/
@Data
public class User implements Serializable {
    private String id;
    private String name;
    private String pwd;

}
