package com.rzk.aaa;

import com.rzk.demo1.Host;
import com.rzk.demo1.Proxy;
import com.rzk.demo1.Rent;
import com.rzk.dome4.UserService;
import com.rzk.dome4.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        jdkProxy jdk = new jdkProxy();
        jdk.setTarger(userService);
        UserService proxy = (UserService) jdk.getProxy();
        proxy.delete();
    }
}
