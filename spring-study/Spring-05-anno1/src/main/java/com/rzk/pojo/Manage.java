package com.rzk.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//这个也会Spring容器托管，注册到容器中，因为他本来就是一个@Component
// @Configuration代表这是一个配置类，和我们之前看的beams.xml
@Configuration
//扫描包，前提需要配置类
@ComponentScan("com.rzk.pojo")
public class Manage {
    //注册一个bean 就相当于我们之前写的bean标签
    //这个方法的名字，就相当于bean标签中的id属性
    //这个方法的返回值，就相当于bean标签中class属性
    @Bean
    public User user(){
        return new User();//就是返回要注入bean的对象
    }
}
