package com.rzk.mapper;

import com.rzk.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public class UserMapperImpl implements UserMapper {
    //我们的所有操作,都使用sqlSession来执行,在原来的时候,
    //现在都使用SqlSessionTemplate
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();

    }

}
