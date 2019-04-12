package com.lutong.ershow.bean;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Pid{
    private Integer pidid;

    private Integer foodsid;

    private String foodsname;

    private Integer buyerid;

    private String nickname;

    private Date pidtime;

    private Double pidprice;

    public Integer getPidid() {
        return pidid;
    }

    public void setPidid(Integer pidid) {
        this.pidid = pidid;
    }

    public Integer getFoodsid() {
        return foodsid;
    }

    public void setFoodsid(Integer foodsid) {
        this.foodsid = foodsid;
    }

    public String getFoodsname() {
        return foodsname;
    }

    public void setFoodsname(String foodsname) {
        this.foodsname = foodsname;
    }

    public Integer getBuyerid() {
        return buyerid;
    }

    public void setBuyerid(Integer buyerid) {
        this.buyerid = buyerid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Date getPidtime() {
        return pidtime;
    }



    public void setPidtime(Date pidtime) {
        this.pidtime = pidtime;
    }

    public Double getPidprice() {
        return pidprice;
    }

    public void setPidprice(Double pidprice) {
        this.pidprice = pidprice;
    }
}