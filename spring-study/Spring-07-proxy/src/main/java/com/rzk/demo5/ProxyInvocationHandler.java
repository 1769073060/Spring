package com.rzk.demo5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    private Object target;

    public void setTarget(Object target){
        this.target=target;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Logger(method.getName());

        Object result= method.invoke(target, args);

        return result;
    }
    public void Logger(String msg){
        System.out.println("执行了"+msg+"这个方法\"");
    }
}
