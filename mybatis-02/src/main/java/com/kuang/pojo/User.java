package com.kuang.pojo;

import org.apache.ibatis.type.Alias;

/**
 * @program: Mybatis-Study
 * @description: 实体类
 * @author: Qin
 * @date: 2020-03-24
 **/
@Alias("User")
public class User {
    private int id;
    private String name;
    private String pwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public User() {
    }

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id:" + id +
                ", name:'" + name + '\'' +
                ", pwd:'" + pwd + '\'' +
                '}';
    }

}

