package com.lutong.ershow.mapper;

import com.lutong.ershow.bean.Comments;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsMapper {
    int insert(Comments record);

    int insertSelective(Comments record);
}