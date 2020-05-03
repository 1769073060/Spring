import com.rzk.mapper.UserMapper;
import com.rzk.mapper.UserMapperImpl;
import com.rzk.mapper.UserMapperImpl2;
import com.rzk.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MyTest {
    @Test
    public static void main(String[] args)throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = (UserMapper) context.getBean("userMapper2");
        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }
    }
}
