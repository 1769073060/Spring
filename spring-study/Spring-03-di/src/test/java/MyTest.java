import com.rzk.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = context.getBean("Student", Student.class);
        System.out.println(student);
        /*Student{name='丽斯',
        address=Address{address='中国'},
        age=Age{age=19},
         books=[水浒传, 西游记, 红楼梦],
          hobbys=[看电影, 看小说],
          card={card=卡片, card1=卡片1},
           games=[lol, 看门狗, 刺客信条],
           wife='null', info={root=账号,
            driver=连接, pwd=密码}}
        */
    }
}
