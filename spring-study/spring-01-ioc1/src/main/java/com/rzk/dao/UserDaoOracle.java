package com.rzk.dao;

public class UserDaoOracle implements UserDao {
    @Override
    public void getUser() {
        System.out.println("Oracle数据输出");
    }
}
