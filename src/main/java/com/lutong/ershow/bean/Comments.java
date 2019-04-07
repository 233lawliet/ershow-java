package com.lutong.ershow.bean;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Comments {
    private Integer commentid;

    private Integer foodsid;

    private Integer userid;

    private String nickname;

    private String photo;

    private Integer commentobject;

    private Integer curlevel;

    private String comments;

    private Date commenttime;

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public Integer getFoodsid() {
        return foodsid;
    }

    public void setFoodsid(Integer foodsid) {
        this.foodsid = foodsid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Integer getCommentobject() {
        return commentobject;
    }

    public void setCommentobject(Integer commentobject) {
        this.commentobject = commentobject;
    }

    public Integer getCurlevel() {
        return curlevel;
    }

    public void setCurlevel(Integer curlevel) {
        this.curlevel = curlevel;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }
}