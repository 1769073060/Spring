package com.rzk.dome6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    private Object targer;

    public void setTarger(Object targer){
        this.targer=targer;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                targer.getClass().getInterfaces(),
                this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        loogger(method.getName());
        Object result= method.invoke(targer, args);

        return result;
    }
    public void loogger(String msg){
        System.out.println("你使用了"+msg+"方法");
    }
}
