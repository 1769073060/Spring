package com.rzk.dome3;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//会用这个动态生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private sellCar sellcar;


    public void setSellcar(sellCar sellcar){
        this.sellcar=sellcar;
    }


    //生成代理类
    public Object getProxy(){
       return Proxy.newProxyInstance(this.getClass().getClassLoader(),sellcar.getClass().getInterfaces(),this);
    }

    //处理代理实例并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，就是使用反射机制实现
        Object result = method.invoke(sellcar, args);
        return result;
    }


}
