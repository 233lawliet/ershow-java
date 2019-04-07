package com.lutong.ershow.bean;

import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class AfterSale {
    private Integer aftersaleid;

    private Integer foodsid;

    private Integer userid;

    private Integer sellerscore;

    private Integer foodsscore;

    private Date scoretime;

    public Integer getAftersaleid() {
        return aftersaleid;
    }

    public void setAftersaleid(Integer aftersaleid) {
        this.aftersaleid = aftersaleid;
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

    public Integer getSellerscore() {
        return sellerscore;
    }

    public void setSellerscore(Integer sellerscore) {
        this.sellerscore = sellerscore;
    }

    public Integer getFoodsscore() {
        return foodsscore;
    }

    public void setFoodsscore(Integer foodsscore) {
        this.foodsscore = foodsscore;
    }

    public Date getScoretime() {
        return scoretime;
    }

    public void setScoretime(Date scoretime) {
        this.scoretime = scoretime;
    }
}