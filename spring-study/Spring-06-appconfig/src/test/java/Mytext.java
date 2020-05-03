import com.rzk.config.RzkConfig;
import com.rzk.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class Mytext {

    @Test
    public void test(){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RzkConfig.class);
        User getUser = (User) context.getBean("user");
        System.out.println(getUser.getName());

    }
}
