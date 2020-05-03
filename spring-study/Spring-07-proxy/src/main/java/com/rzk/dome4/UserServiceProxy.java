package com.rzk.dome4;

public class UserServiceProxy implements UserService {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        logger("增加");
        userService.add();
    }

    @Override
    public void delete() {
        logger("删除");
        userService.delete();
    }

    @Override
    public void update() {
        logger("修改");
        userService.update();
    }

    @Override
    public void query() {
        logger("查询");
        userService.query();
    }

    //日志
    public void logger(String msg){
        System.out.println("使用"+msg);
    }
}
