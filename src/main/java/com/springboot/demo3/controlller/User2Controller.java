package com.springboot.demo3.controlller;

import com.springboot.demo3.entity.User;
import com.springboot.demo3.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author :信仰
 * @Date :2023/5/26 20:03
 */


@Controller
public class User2Controller {

    @Resource
    private UserService userService;


    @RequestMapping("/register")
    @ResponseBody
    public User register(User user){
        return userService.addUser(user);
    }
}
