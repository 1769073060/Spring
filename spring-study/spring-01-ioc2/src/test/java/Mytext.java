import com.rzk.dao.UserDao;
import com.rzk.service.UserService;
import com.rzk.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytext {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

        userServiceImpl.getUser();

    }
}
