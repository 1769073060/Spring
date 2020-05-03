import com.rzk.pojo.Manage;
import com.rzk.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User getManage = (User) context.getBean("user");
        System.out.println(getManage.getName());

    }
}
