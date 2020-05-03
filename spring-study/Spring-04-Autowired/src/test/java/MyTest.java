import com.rzk.pojo.Dog;
import com.rzk.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applocationContext.xml");
//        People people = context.getBean("people", People.class);
        Dog dog = context.getBean("dog", Dog.class);
        System.out.println(dog.getDog());
    }
}
