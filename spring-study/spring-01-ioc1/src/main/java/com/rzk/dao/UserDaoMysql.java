package com.rzk.dao;

import com.rzk.service.UserService;

public class UserDaoMysql implements UserDao {

    @Override
    public void getUser() {
        System.out.println("mysql数据输出");
    }
}
