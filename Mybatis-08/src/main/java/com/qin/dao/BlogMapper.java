package com.qin.dao;

import com.qin.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @program: Mybatis-Study
 * @description: blogMapper
 * @author: Qin
 * @date: 2020-03-29
 **/
public interface BlogMapper {
    Blog getBlogs();

    int addBlog(Blog blog);

    int updateBlog(Blog blog);

    List<Blog> getListBlog(Map map);

    int updateBlog1(Map blog);


}
