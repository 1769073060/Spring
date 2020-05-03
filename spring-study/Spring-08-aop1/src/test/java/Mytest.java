import com.rzk.service.UserService;
import com.rzk.service.UserServiceImpl;
import org.aspectj.apache.bcel.util.ClassPath;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理的是接口
        UserService userService = (UserService) context.getBean("userService");
        userService.delete();

    }
}
