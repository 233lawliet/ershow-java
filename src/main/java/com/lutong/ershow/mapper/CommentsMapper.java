package com.lutong.ershow.mapper;

import com.lutong.ershow.bean.Comments;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentsMapper {
    int insert(Comments record);


    //通过用户的id
    List<Comments> getComments(Integer  foodsid);
}