package com.rzk.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
// 等价于 <bean id="user" class="com.rzk.pojo.User"/>
//@Component 组件
@Component
//singleton
//prototype
@Scope("prototype")
public class User {
    /*相当于           <property name="name" value="Lisi"/>*/
    @Value("祝凯")
    public String name;
}
