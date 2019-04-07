package com.lutong.ershow.bean;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class FoodsOrder {
    private Integer orderid;

    private Integer foodsid;

    private String foodsname;

    private Integer sellerid;

    private String sellername;

    private Integer buyerid;

    private String buyername;

    private Double buyerprice;

    private String tranplace;

    private Date trantime;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
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
        this.foodsname = foodsname == null ? null : foodsname.trim();
    }

    public Integer getSellerid() {
        return sellerid;
    }

    public void setSellerid(Integer sellerid) {
        this.sellerid = sellerid;
    }

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername == null ? null : sellername.trim();
    }

    public Integer getBuyerid() {
        return buyerid;
    }

    public void setBuyerid(Integer buyerid) {
        this.buyerid = buyerid;
    }

    public String getBuyername() {
        return buyername;
    }

    public void setBuyername(String buyername) {
        this.buyername = buyername == null ? null : buyername.trim();
    }

    public Double getBuyerprice() {
        return buyerprice;
    }

    public void setBuyerprice(Double buyerprice) {
        this.buyerprice = buyerprice;
    }

    public String getTranplace() {
        return tranplace;
    }

    public void setTranplace(String tranplace) {
        this.tranplace = tranplace == null ? null : tranplace.trim();
    }

    public Date getTrantime() {
        return trantime;
    }

    public void setTrantime(Date trantime) {
        this.trantime = trantime;
    }
}