import com.qin.dao.TeacherMapper;
import com.qin.pojo.Teacher;
import com.qin.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @program: Mybatis-Study
 * @description:
 * @author: Qin
 * @date: 2020-03-28
 **/
public class MyTest {
    @Test
    public void getTeacherByID() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacherByID(1);
        System.out.println("teacher:" + teacher);
    }
}
