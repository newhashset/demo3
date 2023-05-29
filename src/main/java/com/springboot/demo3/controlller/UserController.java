package com.springboot.demo3.controlller;

import com.springboot.demo3.entity.User;
import com.springboot.demo3.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;

/**
 * @Author :信仰
 * @Date :2023/5/26 14:34
 */


@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping("/register")
    @ResponseBody
    public User regist(User user){
        return userService.RegisterUser(user);
    }
}
