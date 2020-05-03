package com.rzk.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于  在xml配置   <bean id="dog" class="com.rzk.pojo.Dog"/>
@Component
public class Dog {

    private String name;

    public String getDog() {
        return name;
    }
    @Value("狗子")
    public void setDog(String dog) {
        this.name = dog;
    }

    public void shout(){
        System.out.println("狗叫");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}