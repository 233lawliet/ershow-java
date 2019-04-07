package com.lutong.ershow.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class FoodsOthers {

    public  FoodsOthers(){
    }

    private Integer foodsid;

    private Integer views;

    private Integer comments;

    private Integer pids;

    public Integer getFoodsid() {
        return foodsid;
    }

    public void setFoodsid(Integer foodsid) {
        this.foodsid = foodsid;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public Integer getPids() {
        return pids;
    }

    @Override
    public String toString() {
        return "FoodsOthers{" +
                "foodsid=" + foodsid +
                ", views=" + views +
                ", comments=" + comments +
                ", pids=" + pids +
                '}';
    }

    public void setPids(Integer pids) {
        this.pids = pids;
    }


}