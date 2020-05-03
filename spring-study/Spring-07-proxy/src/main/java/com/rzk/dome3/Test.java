package com.rzk.dome3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
//        Class c = User.class;
        Class c = Class.forName("com.rzk.dome3.User");

//        User user = (User) c.newInstance();//本质调用无参构造
//        System.out.println(user);

        //通过构造器创建对象
//        Constructor cons = c.getDeclaredConstructor(Integer.class, String.class,String.class);
//        User user2 = (User) cons.newInstance(1,"管理员", "小明");
//        System.out.println(user2);
//
        User user = (User)c.newInstance();

//        Field id = c.getDeclaredField("id");
//        //不能直接操作私有属性   要关闭程序的 安全监测
//        id.setAccessible(true);
//        id.set(user,11);




    }
}
