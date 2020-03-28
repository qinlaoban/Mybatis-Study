package com.qin.Test;

import com.qin.dao.StudentMapper;
import com.qin.dao.TeacherMapper;
import com.qin.pojo.Student;
import com.qin.pojo.Teacher;
import com.qin.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @program: Mybatis-Study
 * @description: 测试
 * @author: Qin
 * @date: 2020-03-27
 **/
public class ProjectTest {
    @Test
    public void getAllList() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher t = mapper.getTeacher(1);
        System.out.println("t:" + t);
        sqlSession.close();
    }
    @Test
    public void getAllStudent() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudents();
        for (Student student : students) {
            System.out.println("student:" + student);
        }

        sqlSession.close();
    }
    @Test
    public void getAllStudent2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudents2();
        for (Student student : students) {
            System.out.println("student2:" + student);
        }

        sqlSession.close();
    }
    @Test
    public void getStudentById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = mapper.getStudentById(1,"小李");
        System.out.println("stu:" + student);
        sqlSession.close();
    }

}
