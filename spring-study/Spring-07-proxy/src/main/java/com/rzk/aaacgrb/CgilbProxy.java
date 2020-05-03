package com.rzk.aaacgrb;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
/**
 * Cglib 动态代理
 * 1.引入cglib-nodep-2.2.jar 依赖
 * 2.实现MethodInterceptor 接口
 * 3.创建一个代理对象
 * 4.完成 intercept方法
 */
public class CgilbProxy implements MethodInterceptor {
    /**
     * 返回一个代理对象
     * @param classes
     * @return
     */
    public Object getInstance(Class<?> classes){
        // 通过Enhancer创建一个代理类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(classes);
        enhancer.setCallback(this);

        //创建一个代理对象
        return enhancer.create();
    }
    /**
     * 返回一个代理对象
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //proxy  是上个方法的代理对象
        //method 调用的方法
        //args  返回参数
        System.out.println("代理的方法"+ method.getName());
        Object result = methodProxy.invokeSuper(o, objects);

        return result;
    }
}
