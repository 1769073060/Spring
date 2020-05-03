package com.rzk.demo5;

import com.rzk.dome4.UserService;
import com.rzk.dome4.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        Manage manage = new Manage();
        UserServiceImpl userService = new UserServiceImpl();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();

//        pih.setTarget(manage);
        pih.setTarget(userService);
//        sellCar proxy = (sellCar) pih.getProxy();
        UserService proxy1 = (UserService) pih.getProxy();
        proxy1.delete();
//        proxy.sellcar();
    }
}
