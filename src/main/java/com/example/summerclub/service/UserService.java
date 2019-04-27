package com.example.summerclub.service;

import com.example.summerclub.pojo.User;

import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-03-02 00:25
 * @Description: SualLabel, Write down some description!!!
 */
public interface UserService {
    //添加user
    void insertUser(User user);
    //通过id删除user
    void deleteUserById(long id);
    //通过主键id更新user，更新值不为null的字段
    void updateUserById(User user);
    //通过id发现user
    User findUserById(long id);
    //通过username发现user，验证该用户名是否被注册
    List<User> findUserByUsername(String username);
    //登录
    List<User> findUserByUsernameAndPassword(String username,String password);
    //显示所有user
    List<User> findAllUser();
}
