import com.qin.dao.UserMapper;
import com.qin.pojo.User;
import com.qin.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @program: Mybatis-Study
 * @description:
 * @author: Qin
 * @date: 2020-03-29
 **/
public class Mytest {
    @Test
    public void getAllUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User u = mapper.getUser();
        sqlSession.close();


        SqlSession sqlSession1 = MybatisUtils.getSqlSession();
        UserMapper mapper1 = sqlSession.getMapper(UserMapper.class);
        User u1 = mapper1.getUser();
        sqlSession1.close();

        System.out.println("result:" + (u == u1));

    }
}
