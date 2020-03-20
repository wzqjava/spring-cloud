package com.wzq.mybatisdemo.service.impl;


import com.wzq.mybatisdemo.entity.User;
import com.wzq.mybatisdemo.mapper.IUserMapper;
import com.wzq.mybatisdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 简单用户链接Mysql数据库微服务（通过@Service注解标注该类为持久化操作对象）。
 * @author 王志强
 * @version 0.0.1
 * @date 2020-03-17
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserMapper iUserMapper;

    @Override
    public User findUserById(Long id) {
        return iUserMapper.findUserById(id);
    }

    @Override
    public List<User> findAllUsers() {
        return iUserMapper.findAllUsers();
    }

    @Override
    public int insertUser(User user) {
        return iUserMapper.insertUser(user);
    }
}