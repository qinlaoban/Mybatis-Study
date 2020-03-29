import com.qin.dao.BlogMapper;
import com.qin.pojo.Blog;
import com.qin.utils.MybatisUtils;
import com.qin.utils.UuidUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @program: Mybatis-Study
 * @description:
 * @author: Qin
 * @date: 2020-03-29
 **/
public class MyTest {
    @Test
    public void getBlogs() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = mapper.getBlogs();
        System.out.println("blog:" + blog);
    }
    @Test
    public void addBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog b = new Blog();
        b.setId(UuidUtils.get_uuid());
        b.setAuthor("qin1");
        b.setCreateDate(new Date());
        b.setViews(10000);
        b.setTitle("哈哈哈");
        mapper.addBlog(b);


    }
    @Test
    public void updateBlog() {
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
//        Blog b = new Blog();
//        b.setId(1);
//        b.setTitle("hh");
//        mapper.updateBlog(b);
    }
    @Test
    public void getListBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("title","java");
        map.put("author","甲骨文");
        List<Blog> listBlog = mapper.getListBlog(map);
        for (Blog blog : listBlog) {
            System.out.println("blog:" + blog);
        }
    }
    @Test
    public void updateBlog1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("id","1");
        map.put("title","java1");
        map.put("author","java11111");

        mapper.updateBlog1(map);
    }

}
