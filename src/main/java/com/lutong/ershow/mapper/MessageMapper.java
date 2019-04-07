package com.lutong.ershow.mapper;

import com.lutong.ershow.bean.Message;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageMapper {
    int insert(Message record);

    int insertSelective(Message record);
}