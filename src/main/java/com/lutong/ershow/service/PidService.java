package com.lutong.ershow.service;

import com.lutong.ershow.bean.*;
import com.lutong.ershow.mapper.PidMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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


    public int insert(Pid record, User user) {


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


}
