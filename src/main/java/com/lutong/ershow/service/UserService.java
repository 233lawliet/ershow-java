package com.lutong.ershow.service;

import com.lutong.ershow.bean.User;
import com.lutong.ershow.mapper.UserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lutong
 * @date 4/5/2019 - 9:40 PM
 */

@Service
public class UserService  {


    @Autowired
    UserMapper userMapper;

    public int insert(User record) {
        return userMapper.insert(record);
    }

    public int checkLogin(User user){
        return userMapper.checkLogin(user);
    }


    public User getUserInfoById(User user){
        return userMapper.getUserInfoById(user);
    };

}
