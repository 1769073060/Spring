package com.rzk.service;

import com.rzk.dao.UserDao;

public class UserServiceImpl implements UserService {
    private UserDao userDao ;
    //利用set进行动态实现直
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}

