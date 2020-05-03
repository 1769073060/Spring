package com.rzk.dao;

public class UserDaoMysql implements UserDao {
    @Override
    public void getUser() {
        System.out.println("mysql实现类");
    }
}
