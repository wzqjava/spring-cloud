package com.wzq.mybatisdemo.service;

import com.wzq.mybatisdemo.entity.User;

import java.util.List;

/**
 * 简单用户链接Mysql数据库微服务（通过@Service注解标注该类为持久化操作对象）。
 *
 * @author 王志强
 * @version 0.0.1
 * @date 2020-03-17
 */
public interface IUserService {

    User findUserById(Long id);

    List<User> findAllUsers();

    int insertUser(User user);
}
