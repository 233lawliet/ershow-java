package com.lutong.ershow.service;

import com.lutong.ershow.bean.FoodsOrder;
import com.lutong.ershow.mapper.FoodsOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lutong
 * @date 4/4/2019 - 10:02 PM
 */
@Service
public class FoodsOrderService  {

    @Autowired
    FoodsOrderMapper foodsOrderMapper;

    @Autowired
    FoodsOrder foodsOrder;

    public int insert(FoodsOrder record) {
        return foodsOrderMapper.insert(record);
    }


    public  int updateMaxPid(FoodsOrder foodsOrder){
        return  foodsOrderMapper.updateMaxPid(foodsOrder);
    }

    public FoodsOrder getFoodsOrderById(Integer foodsId){
        foodsOrder.setFoodsid(foodsId);
        return  foodsOrderMapper.getFoodsOrderById(foodsOrder);
    }

    public List<FoodsOrder> getFoodsOrderByBuyer(Integer buyerId){
        return  foodsOrderMapper.getFoodsOrderByBuyer(buyerId);
    }
    public List<FoodsOrder> getFoodsOrderBySeller(Integer sellerId){
        return  foodsOrderMapper.getFoodsOrderBySeller(sellerId);
    }

}
