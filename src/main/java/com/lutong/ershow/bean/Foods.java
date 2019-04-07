package com.lutong.ershow.bean;



import com.lutong.ershow.service.FoodsOthersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Random;

@Component
public class Foods {
    private Integer foodsid;

    private String foodsname;

    private Integer typeid;

    private String foodsinfo;

    private String image1;

    private String image2;

    private String image3;

    private Integer userid;

    private Date starttime;

    private Integer hours;

    private Double startprice;

    private String place;

    private FoodsOthers foodsOthers;

    private Double curPrice;

    //获取当前的价格
    public Double getCurPrice() {
        return curPrice;
    }

    public void setCurPrice(Double curPrice) {
        this.curPrice = curPrice;
    }

    //获取结束的时间
    public Date getEndTime(){
        Date endTime=new Date();
        endTime.setTime(this.getStarttime().getTime()+this.getHours()*60*60*1000);
        return  endTime;
    }


    //设置foodsOthers
    public void setFoodsOthers(FoodsOthers foodsOthers){

        this.foodsOthers=foodsOthers;
    }

    public FoodsOthers getFoodsOthers(){
        return this.foodsOthers;
    }



    //判定该商品是狗获取     1还存在  -1商品已经结束了
    public Boolean isExist(){
        if(new Date().compareTo(this.getEndTime())==1){
            return false;
        }else{
            return  true;
        }
    }

    //获取商品id的随机数
    public void setRamdomFoodsId(){
        //时间戳随机数
        Integer id1=(int)(new Date().getTime()/1000%10000000);

        //random随机数
        Random random=new Random();
        Integer id2= random.nextInt(100);
        this.foodsid=Integer.parseInt(id1.toString()+""+id2.toString());
        System.out.println("当前商品的foodsId:"+this.foodsid+"\n");
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

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getFoodsinfo() {
        return foodsinfo;
    }

    public void setFoodsinfo(String foodsinfo) {
        this.foodsinfo = foodsinfo == null ? null : foodsinfo.trim();
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1 == null ? null : image1.trim();
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2 == null ? null : image2.trim();
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3 == null ? null : image3.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getStartprice() {
        return startprice;
    }

    public void setStartprice(Double startprice) {
        this.startprice = startprice;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }
}