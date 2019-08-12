package com.MustLearnSSM.controller;

import com.MustLearnSSM.pojo.User;
import com.MustLearnSSM.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: xiaozhe
 * @Date: 2019/8/9 10:59
 */
@Controller
public class UserController {
    
    @Autowired
    UserService userService;
    
    @RequestMapping("/user/{userid}")
    @ResponseBody
    public User getUserById(@PathVariable int userid){
        User user=userService.getUserById(userid);
        return user;
    }
    
}
