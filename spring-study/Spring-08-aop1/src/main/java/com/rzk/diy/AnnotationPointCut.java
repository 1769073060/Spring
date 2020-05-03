package com.rzk.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

@Aspect//标注这个类是切面
public class AnnotationPointCut {
    @Before(" execution(* com.rzk.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("======方法执行前======");
    }
    @After("execution(* com.rzk.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("======方法执行后======");
    }
    //在环绕增强中，我们可以给定一个参数，代表我们要获取出来切入的点
    @Around("execution(* com.rzk.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");

        Signature signature = jp.getSignature();//获得签名
        System.out.println("signature"+signature);

        //执行方法
        Object proceed = jp.proceed();
        System.out.println("环绕后");
    }

}
