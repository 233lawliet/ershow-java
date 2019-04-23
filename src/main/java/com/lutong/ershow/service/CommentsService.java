package com.lutong.ershow.service;

import com.lutong.ershow.bean.Comments;
import com.lutong.ershow.mapper.CommentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lutong
 * @date 4/23/2019 - 5:29 PM
 */
@Service
public class CommentsService   {


    @Autowired
    public CommentsMapper commentsMapper;


    public int insert(Comments record) {
        return commentsMapper.insert(record);
    }


    public List<Comments> getComments(Integer foodsid) {
        return commentsMapper.getComments(foodsid);
    }
}
