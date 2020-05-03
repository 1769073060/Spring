package com.rzk.dao;

public class UserDaoService implements UserDao {
    @Override
    public void getUser() {
        System.out.println("Service数据输出");
    }
}
