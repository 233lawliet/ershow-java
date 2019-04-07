package com.lutong.ershow.bean;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Pid {
    private Integer pidid;

    private Integer foodsid;

    private Integer buyerid;

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

    public Integer getBuyerid() {
        return buyerid;
    }

    public void setBuyerid(Integer buyerid) {
        this.buyerid = buyerid;
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

    @Override
    public String toString() {
        return "Pid{" +
                "pidid=" + pidid +
                ", foodsid=" + foodsid +
                ", buyerid=" + buyerid +
                ", pidtime=" + pidtime +
                ", pidprice=" + pidprice +
                '}';
    }
}