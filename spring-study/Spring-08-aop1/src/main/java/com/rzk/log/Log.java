package com.rzk.log;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.invoke.MethodHandleInfo;
import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {
    //method 要执行的目标对象方法
    //args 参数
    //target 目标对象
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName());
    }
}
