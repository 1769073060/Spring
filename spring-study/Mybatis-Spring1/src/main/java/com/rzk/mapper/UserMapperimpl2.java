package com.rzk.mapper;

import com.rzk.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperimpl2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> selectUser() {
        SqlSession sqlSession = getSqlSession();
        return  sqlSession.getMapper(UserMapper.class).selectUser();
    }
}
