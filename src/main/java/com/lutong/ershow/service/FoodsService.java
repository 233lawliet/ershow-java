package com.lutong.ershow.service;

import com.lutong.ershow.bean.Foods;
import com.lutong.ershow.bean.FoodsOrder;
import com.lutong.ershow.bean.FoodsOthers;
import com.lutong.ershow.bean.User;
import com.lutong.ershow.mapper.FoodsMapper;
import com.lutong.ershow.mapper.FoodsOthersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
/**
 * @author lutong
 * @date 4/4/2019 - 8:49 AM
 */

@Service
public class FoodsService {


    @Autowired
    FoodsMapper foodsMapper;

    @Autowired
    FoodsOrder foodsOrder;
    @Autowired
    FoodsOrderService foodsOrderService;

    @Autowired
    FoodsOthersService foodsOthersService;



    public int insert(Foods foods,User user) {

        //为商品设置随机ID
        foods.setRamdomFoodsId();
        //设置商品开始的时间
        foods.setStarttime(new Date());

        foodsMapper.insert(foods);

         //统计表
        FoodsOthers foodsOthers=new FoodsOthers();

        foodsOthers.setFoodsid(foods.getFoodsid());
        System.out.println(foodsOthers.toString());
        foodsOthersService.insertSelective(foodsOthers);

         //订单表
        FoodsOrder foodsOrder=new FoodsOrder();
        foodsOrder.setSellerid(user.getUserid()); //用户id
        foodsOrder.setSellername(user.getUsername());  //用户昵称
        foodsOrder.setSellerprice(foods.getStartprice());  //初始价格
        foodsOrder.setFoodsid(foods.getFoodsid()); //商品id
        foodsOrder.setFoodsname(foods.getFoodsname()); //商品名称
        foodsOrder.setTranplace(foods.getPlace());  //交易地点
        foodsOrderService.insert(foodsOrder);

        return 1;

    }


    public int insertSelective(Foods record) {
        return 0;
    }


    @Autowired
    FoodsOthers foodsOthers;
    public List<Foods> getAllFoods() {

        List<Foods> foodss= foodsMapper.getAllFoods();


        //丰富foods信息，不改变数据库结构
        for(Foods foods:foodss){

            //添加其他信息
            foodsOthers.setFoodsid(foods.getFoodsid());
            foodsOthers=foodsOthersService.getFoodsOthers(foodsOthers);
            // 当前价格信息 +当前用户id
            foodsOrder=foodsOrderService.getFoodsOrderById(foods.getFoodsid());
            foods.setCurPrice(foodsOrder.getBuyerprice());
            foods.setBuyerid(foodsOrder.getBuyerid());

            foods.setFoodsOthers(foodsOthers);
        }
        return  foodss;
    }


    public Foods getFoodsById(int id) {
        return foodsMapper.getFoodsById(id);
    }

    public List<Foods> getFoodsByName(String name){


        List<Foods> foodss= foodsMapper.getFoodsByName(name);


        //丰富foods信息，不改变数据库结构
        for(Foods foods:foodss){

            //添加其他信息
            foodsOthers.setFoodsid(foods.getFoodsid());
            foodsOthers=foodsOthersService.getFoodsOthers(foodsOthers);
            // 当前价格信息 +当前用户id
            foodsOrder=foodsOrderService.getFoodsOrderById(foods.getFoodsid());
            foods.setCurPrice(foodsOrder.getBuyerprice());
            foods.setBuyerid(foodsOrder.getBuyerid());

            foods.setFoodsOthers(foodsOthers);
        }
        return  foodss;
    }

}
