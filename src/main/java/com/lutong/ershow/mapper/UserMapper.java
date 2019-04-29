package com.lutong.ershow.mapper;

import com.lutong.ershow.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    //检查用户登录
    User checkLogin(User user);

    //检测账号是否存在
    Integer checkAccount(User user);

    //获取用户的信息(治用的了id)
    User getUserInfoById(User user);

    //更新用户的信息
    Integer updateUserInfo(User user);


    //获取所有用户的信息
    List<User> allUsers();


}