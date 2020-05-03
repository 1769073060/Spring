import com.rzk.pojo.Student;
import com.rzk.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student  = (Student) context.getBean("Student");
        System.out.println(student);
    }
}
