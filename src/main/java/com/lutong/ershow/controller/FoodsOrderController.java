package com.lutong.ershow.controller;

import com.lutong.ershow.bean.FoodsOrder;
import com.lutong.ershow.service.FoodsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author lutong
 * @date 4/11/2019 - 5:48 PM
 */
@Controller
public class FoodsOrderController {

    @Autowired
    FoodsOrderService foodsOrderService;

    @ResponseBody
    @RequestMapping("getFoodsOrderByBuyer")
    public List<FoodsOrder> getFoodsOrderByBuyer(Integer buyerId){
        return  foodsOrderService.getFoodsOrderByBuyer(buyerId);
    }

    @ResponseBody
    @RequestMapping("getFoodsOrderBySellerId")
    public List<FoodsOrder> getFoodsOrderBySellerId(Integer sellerId){
        return  foodsOrderService.getFoodsOrderBySeller(sellerId);
    }

    @ResponseBody
    @RequestMapping("getAllFoodsOrder")
    public List<FoodsOrder> getAllFoodsOrder(Integer sellerId){
        return  foodsOrderService.getAllFoodsOrder(sellerId);
    }


    @ResponseBody
    @RequestMapping("getFoodsOrderByOrderID")
    public FoodsOrder getFoodsOrderByOrderID(Integer orderid){
        return  foodsOrderService.getFoodsOrderByOrderID(orderid);
    }



    @ResponseBody
    @RequestMapping("getCountOrder")
    public Integer getCountOrder(){
        return  foodsOrderService.getCountOrder();
    }
}
