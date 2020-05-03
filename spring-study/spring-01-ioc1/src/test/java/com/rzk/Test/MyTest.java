package com.rzk.Test;

import com.rzk.dao.UserDaoImpl;
import com.rzk.dao.UserDaoMysql;
import com.rzk.service.UserService;
import com.rzk.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void Service(){
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");

        UserServiceImpl userService = (UserServiceImpl) context.getBean("UserServiceImpl");
        userService.getUser();

    }
}
