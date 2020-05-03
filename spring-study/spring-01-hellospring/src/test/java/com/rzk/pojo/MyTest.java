package com.rzk.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void myTest(){
        //获取Spring 上下文对象
        ApplicationContext contex = new ClassPathXmlApplicationContext("ApplactionContext.xml");
        //我们的对象现在都在spring 管理   我们需要就取出来
        Hello hello = (Hello) contex.getBean("hello");
        hello.show();
        System.out.println(hello.toString());
    }
}
