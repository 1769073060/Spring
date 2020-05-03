package com.rzk.mapper;

import com.rzk.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {
    private SqlSessionTemplate sqlSession;
    public void setSqlSession(SqlSessionTemplate sqlSession){
        this.sqlSession = sqlSession;
    }
    @Override
    public List<User> selectUser() {
        User user = new User(8, "聊吧", "123123");

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(user);
        mapper.deleteUser(9);
        return mapper.selectUser();
    }

    @Override
    public int addUser(User user) {
        return sqlSession.getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return sqlSession.getMapper(UserMapper.class).deleteUser(id);
    }
}
