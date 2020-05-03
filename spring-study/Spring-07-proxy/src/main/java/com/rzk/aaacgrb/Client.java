package com.rzk.aaacgrb;

import com.rzk.demo1.Host;
import com.rzk.demo1.Proxy;
import com.rzk.demo5.Manage;
import com.rzk.demo5.sellCar;
import com.rzk.dome3.User;
import com.rzk.dome4.UserService;
import com.rzk.dome4.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        CgilbProxy cgilbProxy = new CgilbProxy();
//        sellCar  instance = (sellCar) cgilbProxy.getInstance(Manage.class);
//        instance.sellcar();

        Manage manage= (Manage) cgilbProxy.getInstance(Manage.class);
        manage.sellcar();
    }
}
