package com.lutong.ershow.controller;

import com.lutong.ershow.bean.Comments;
import com.lutong.ershow.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @author lutong
 * @date 4/23/2019 - 5:32 PM
 */

@Controller
public class CommentsController {

    @Autowired
    public CommentsService commentsService;


    @ResponseBody
    @RequestMapping("getComments")
    public List<Comments> getComments(Integer foodsid){
        return  commentsService.getComments(foodsid);
    }

    @ResponseBody
    @RequestMapping("insertComments")
    public Integer insertComments(Comments comments){
        comments.setCommenttime(new Date());
        return  commentsService.insert(comments);
    }


}
