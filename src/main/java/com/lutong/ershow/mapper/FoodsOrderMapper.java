package com.lutong.ershow.mapper;

import com.lutong.ershow.bean.FoodsOrder;
import com.lutong.ershow.bean.FoodsOthers;
import org.springframework.stereotype.Repository;


@Repository
public interface FoodsOrderMapper {

    int insert(FoodsOrder record);
    //增加订单中的最高投资者
    int updateMaxPid(FoodsOrder foodsOrder);

    //获取指定的订单信息 (通过获取当前的订单信息)
    FoodsOrder getFoodsOrderById(FoodsOrder foodsOrder);
}