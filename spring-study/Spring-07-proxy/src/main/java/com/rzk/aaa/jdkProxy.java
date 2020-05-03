package com.rzk.aaa;

import javax.naming.event.ObjectChangeListener;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/*
* Proxy：代理
* Proxy 提供了创建代理类和实例静态方法
* InvocationHandler：调用处理程序
*
* */


/**
 * jdk代理
 * 1.創建一個代理類
 *作用生成一個代理對象，当代理对象调用方法时，通过反射调用目标对象
 *
 *
 */
public class jdkProxy implements InvocationHandler {
    private Object targer;
    public void setTarger(Object targer) {
        this.targer = targer;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(
                //通过一个代理类去获取类
                this.getClass().getClassLoader(),
                //获取类的接口，你要代理的那个接口
                targer.getClass().getInterfaces(),
                this);
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // proxy 是上个方法的代理对象
        //method 调用的方法
        //args 返回参数
        Object result= method.invoke(targer, args);

        return result;
    }
}
