package com.springboot.demo3.dao;

import com.springboot.demo3.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author :信仰
 * @Date :2023/5/26 14:39
 */

@Mapper
public interface UserDao{

   public int insertUser(User user);


   int addUser(User user);
}
