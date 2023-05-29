package com.springboot.demo3.service.Impl;

import com.springboot.demo3.dao.UserDao;
import com.springboot.demo3.entity.User;
import com.springboot.demo3.service.UserService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * @Author :信仰
 * @Date :2023/5/26 14:36
 */


@Service
public class UserServiceImpl implements UserService {


    @Resource
    private UserDao userDao;


    @Override
    public User addUser(User user) {
        int i = userDao.addUser(user);
        if (i > 0) {
            return user;
        }else {
            return null;
        }
    }

    @Override
    public User RegisterUser(User user) {
        int i = userDao.insertUser(user);
        if (i > 0) {
            return user;
        }else {
            return null;
        }
    }
}
