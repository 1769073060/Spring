package com.rzk.service;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("增加用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public void update() {
        System.out.println("修改用户");

    }

    @Override
    public void select() {
        System.out.println("查询用户");
    }
}
