package com.rzk.dome3;



public class Client {
    public static void main(String[] args) {
        //真实角色
        Manage manage = new Manage();

        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序处理角色来出来我们要调用的接口对象
        pih.setSellcar(manage);

        sellCar proxy = (sellCar) pih.getProxy();

        proxy.sellcar();

    }

}


