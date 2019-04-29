package com.lutong.ershow.controller;

import com.lutong.ershow.bean.User;
import com.lutong.ershow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @author lutong
 * @date 4/5/2019 - 9:41 PM
 */

@Controller
public class UserController {


    @Autowired
    UserService userService;


    @ResponseBody
    @RequestMapping("allUsers")
    public List<User> getAllUsers(){
        return userService.allUsers();
    }

    @ResponseBody
    @RequestMapping("insertUser")
    public int insertUser(User user){
        return userService.insert(user);
    }

    @ResponseBody
    @RequestMapping("checkLogin")
    public User checkLogin(User user){
        return userService.checkLogin(user);
    }

    @ResponseBody
    @RequestMapping("checkAccount")
    public Integer checkAccount(User user){
        return userService.checkAccount(user);
    }

    @ResponseBody
    @RequestMapping("getUserById")
    public User getUserById(User user){
        //所有数据都封装了 只用了id
        return userService.getUserInfoById(user);
    }



    @ResponseBody
    @RequestMapping("updateUserInfo")
    public Integer updateUserInfo(User user){
        System.out.println(user.toString());
        return userService.updateUserInfo(user);
    }


}
