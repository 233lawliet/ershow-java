package com.lutong.ershow.service;

import com.lutong.ershow.bean.*;
import com.lutong.ershow.mapper.PidMapper;
import com.lutong.ershow.utils.TimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author lutong
 * @date 4/6/2019 - 6:12 PM
 */
@Service
public class PidService {

    @Autowired
    PidMapper pidMapper;

    @Autowired
    FoodsOrderService foodsOrderService;

    @Autowired
    FoodsOthersService foodsOthersService;

    @Autowired
    FoodsOthers foodsOthers;


    @Autowired
    FoodsOrder foodsOrder;

    @Autowired
    User user;

    @Autowired
    UserService userService;

    @Autowired
    Pid pid;
    //竞拍
    public int  insert(Pid record, User user) {


        //竞拍的时间 +竞拍信息录入
        record.setPidtime(new Date());
        pidMapper.insert(record);

        //更改订单中最大的竞价者信息
        foodsOrder.setFoodsid(record.getFoodsid());//查找用
        foodsOrder.setBuyerprice(record.getPidprice());
        foodsOrder.setBuyerid(user.getUserid());
        foodsOrder.setBuyername(user.getNickname());
        foodsOrderService.updateMaxPid(foodsOrder);


        foodsOthers.setFoodsid(record.getFoodsid());
        foodsOthersService.addPids(foodsOthers);


        return  1;
    }

    //获取竞拍的信息
    public List<Pid> getPids(int foodsid){

        pid.setFoodsid(foodsid);
        return  pidMapper.getPids(pid);
    }

    public List<Pid> getPidsByBuyer(Integer buyerId){
        return pidMapper.getPidsByBuyer(buyerId);
    }


    //获取一个星期的竞拍书
    public ArrayList<TimeFormat>  getCountByDay(){
        ArrayList<TimeFormat> result=TimeFormat.getFormat();
        for(int i=0;i<result.size();i++){
            result.get(i).setPidTimes(pidMapper.getCountByDay(result.get(i)));
            result.get(i).setSellTimes(pidMapper.getOrderTimes(result.get(i)));
        }
        return result;
    }

    public List<HashMap<String,Object>> getPidTimesThree(){
        return  pidMapper.getPidTimesThree();
    }
    public List<HashMap<String,Object>> getPidPricesThree(){
        return  pidMapper.getPidPricesThree();
    }
    public List<HashMap<String,Object>> getOrderPriceThree(){
        return  pidMapper.getOrderPriceThree();
    }
    public List<HashMap<String,Object>> getCommentsThree(){
        return  pidMapper.getCommentsThree();
    }

    public List<HashMap<String,Object>> getPidThree(){
        return pidMapper.getPidThree();
    };
    public List<HashMap<String,Object>> getPidTimeThree(){
        return pidMapper.getPidTimeThree();
    };

}
