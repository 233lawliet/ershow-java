package com.lutong.ershow.mapper;

import com.lutong.ershow.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    //检查用户登录
    int checkLogin(User user);

    //获取用户的信息(治用的了id)
    User getUserInfoById(User user);



}