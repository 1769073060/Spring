package com.rzk.mapper;

import com.rzk.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();

    //添加一个用户
    int addUser(User user);

    //删除一个用户
    int deleteUser(@Param("id") int id);
}
