import com.rzk.mapper.UserMapper;
import com.rzk.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper bean = context.getBean(UserMapper.class);
//        int i = bean.addUser(new User(9, "聊吧", "123123"));
//        if (i>0){
//            System.out.println("添加成功");
//        }
        List<User> userList = bean.selectUser();
        for (User user : userList) {
            System.out.println(user);
        }
    }


}
