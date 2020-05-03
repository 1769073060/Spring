package com.rzk.dome6;

import com.rzk.dome4.UserService;
import com.rzk.dome4.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        pih.setTarger(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.delete();
    }
}
