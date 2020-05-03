package com.rzk.dome4;

public class Cilent {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl() ;

        UserServiceProxy u = new UserServiceProxy();
        u.setUserService(userService);

        u.delete();
    }
}
