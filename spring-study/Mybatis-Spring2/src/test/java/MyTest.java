import com.rzk.mapper.UserMapper;
import com.rzk.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean("userMapper",UserMapper.class);
        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }

    }
}
