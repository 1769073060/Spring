package com.rzk.dome4;

public class UserServiceImpl implements  UserService {
    @Override
    public void add() {
        System.out.println("增加一个学生");
    }

    @Override
    public void delete() {
        System.out.println("删除一个学生");
    }

    @Override
    public void update() {
        System.out.println("修改一个学生");

    }

    @Override
    public void query() {
        System.out.println("查找一个学生");

    }
}
