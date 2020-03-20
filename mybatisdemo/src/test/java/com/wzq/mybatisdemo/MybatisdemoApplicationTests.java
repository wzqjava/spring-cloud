package com.wzq.mybatisdemo;

import com.wzq.mybatisdemo.entity.User;
import com.wzq.mybatisdemo.mapper.user.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.io.InputStream;

@SpringBootTest
class MybatisdemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test1() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        User user = userMapper.findUserById(1L);
//        System.out.println(user);
    }


}
