package com.lutong.ershow.mapper;

import com.lutong.ershow.bean.FoodsOrder;
import com.lutong.ershow.bean.FoodsOthers;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FoodsOrderMapper {

    int insert(FoodsOrder record);
    //增加订单中的最高投资者
    int updateMaxPid(FoodsOrder foodsOrder);

    //获取指定的订单信息 (通过获取当前的订单信息)
    FoodsOrder getFoodsOrderById(FoodsOrder foodsOrder);

    //获取某个人获取foodS信息
    List<FoodsOrder> getFoodsOrderByBuyer(Integer buyerId);

    //获取某个人销售信息foodS信息
    List<FoodsOrder> getFoodsOrderBySeller(Integer buyerId);

    //获取所有订单  buyID没有用
    List<FoodsOrder> getAllFoodsOrder(Integer buyerId);

    FoodsOrder getFoodsOrderByOrderID (Integer orderid);

    Integer getCountOrder();


}