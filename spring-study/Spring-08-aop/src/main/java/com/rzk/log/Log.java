package com.rzk.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {
    /*
    * method:要执行的方法
    * objects：参数
    * target:目标对象
    *
    * */
    @Override
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"被执行了");
    }
}
